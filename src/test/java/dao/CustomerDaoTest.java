package dao;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;
public class CustomerDaoTest {
    @Autowired
    private CustomerDao customerDao;
    private static ApplicationContext context;

//    @BeforeClass
    public static void init() {
        context = new ClassPathXmlApplicationContext("spring/*.xml");
    }
    @Test
    public void toSay() {
//        CustomerDao customerDao = (CustomerDao)context.getBean("customerDao") ;
        System.out.println(customerDao.toString());
    }
}