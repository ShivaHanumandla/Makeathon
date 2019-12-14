package hack.infy.service;

import hack.infy.bean.BCMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class ProjectService {



    @Autowired
    RestTemplate restTemplate;

    public List<Long> getProjectId(){
        try {
            List<Integer> projects = restTemplate.getForObject("http://localhost:8080/getAllProjectId", List.class);
            List<Long> projectsId = new ArrayList<>();
            for(Integer i :projects){
                projectsId.add(new Long(i));
            }
            return projectsId;
        }catch (Exception e ){
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }

    public BCMS saveProject(BCMS BCMS){
        BCMS e = restTemplate.postForObject("http://localhost:8080/addProject", BCMS,BCMS.class);
        return e;
    }
}
