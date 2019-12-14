package hack.infy.resolvertemplate;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.StringTemplateResolver;


import java.util.Locale;
import java.util.Map;

@Service
public class ReportTemplateEngine {
    private static TemplateEngine instance;
    private final static String TEMPLATE_LOCAL = "US";


    private ReportTemplateEngine() {}

    public static TemplateEngine getInstance() {
        if(instance == null){
            synchronized (ReportTemplateEngine.class) {
                if(instance == null) {
                    instance = new TemplateEngine();
                    StringTemplateResolver templateResolver = new StringTemplateResolver();
                    templateResolver.setTemplateMode(TemplateMode.HTML);
                    instance.setTemplateResolver(templateResolver);
                }
            }
        }
        return instance;
    }

    public String getTemplateFromMap(String htmlContent, String message) {
        instance = getInstance();
        String template = null;
        Context ctx = new Context(new Locale(TEMPLATE_LOCAL));
        if (null != instance) {
            ctx.setVariable("message", message);

            template = instance.process("dummy", ctx);
        }
        return template;
    }

}
