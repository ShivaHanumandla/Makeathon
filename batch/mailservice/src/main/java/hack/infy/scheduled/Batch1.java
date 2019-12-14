package hack.infy.scheduled;

import hack.infy.bean.BCMS;
import hack.infy.bean.Resources;
import hack.infy.service.EmployeeService;
import hack.infy.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;


@Component
public class Batch1 {

    @Scheduled(fixedRate = 2000)
    public void testScheduled(){
        System.out.println("test");
    }


    @Scheduled(cron = "0 * * * * ?")
    public void testCron(){
        System.out.println("test cron");
    }

    @Autowired
    EmployeeService employeeService;
    @Autowired
    ProjectService projectService;

   // @Scheduled(cron = "0 * * * * ?")
   @Scheduled(fixedRate = 10000)
    public void saveEmployee(){
        System.out.println("test cron");
        List<Long> projectIds= projectService.getProjectId(); // get projects

        for(Long i: projectIds){
            System.out.println(i);
            Set<Long> employees = employeeService.getEmployeeId(i);  // for each project get the employee ids from ALCON and Prnomt
            for(Long employeeId:employees){
                Resources resources = employeeService.getDirectoryData(employeeId);  // update the data for the employee
                if(resources!=null) {
                    try {
                        employeeService.saveEmployee(resources);
                    }catch (Exception exp){
                        exp.printStackTrace();
                    }
                }
            }
        }
    }

}
