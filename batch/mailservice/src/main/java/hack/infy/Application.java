package hack.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource(value = "file:G:\\credentials\\mail\\mail.properties",ignoreResourceNotFound = true)
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class);
    }
}
