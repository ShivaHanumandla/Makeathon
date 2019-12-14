package hack.infy.service;

import hack.infy.bean.BCMS;
import hack.infy.bean.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class EmployeeService {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;



    public Resources saveEmployee(Resources resources){
        try {
            Resources e = restTemplate.postForObject("http://localhost:8080/addResource", resources, Resources.class);
            return e;
        }catch (Exception e){
            e.printStackTrace();
        }
       return  null;
    }

    public Set<Long> getEmployeeId(Long id){
        Set<Long> criticalEmployees = new HashSet<>();
        try {
            List<Long> criticalEmployeesAlcon = getEmployeeIdAlcon(id);
            List<Long> criticalEmployeesPromt = getEmployeeIdPromt(id);
            criticalEmployees.addAll(criticalEmployeesAlcon);
            criticalEmployees.addAll(criticalEmployeesPromt);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.EMPTY_SET;
        }
        return criticalEmployees;
    }
    public List<Long> getEmployeeIdPromt(Long id){
        List<Long> employees = new ArrayList<>();
        employees.add(new Long(648879));
        employees.add(new Long(43534));
        return employees;
    }

    public List<Long> getEmployeeIdAlcon(Long id){
        List<Long> employees = new ArrayList<>();
        employees.add(new Long(648879));
        employees.add(new Long(648879));
        return employees;
    }

    public BCMS getEmployee(String employeeId){
        BCMS BCMS = new BCMS();
        BCMS.setId("648879");
        return BCMS;
    }


    // Harmony System Calls //

    public Resources getDirectoryData(Long id){
        try {
            Resources resource = restTemplate.getForObject("http://localhost:8081/employee/"+id, Resources.class);
            return resource;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
