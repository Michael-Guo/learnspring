import constant.StatusEnum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;

/**
 * Created by nangu on 2017/8/24.
 */
public class Spring {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);
        System.out.println("test revert");
        System.out.println("stash");
        for(StatusEnum type: StatusEnum.values()) {
            System.out.println(type);
        }
    }
}
