package dao;

import javafx.application.Application;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.runner.RunWith;


/**
 * Created by nangu on 2017/9/22.
 */


public class PmDaoTest {
    @Autowired
    private PmDao pmDao;
    private static ApplicationContext context;

//    @BeforeClass
    public static void init() {
        context = new ClassPathXmlApplicationContext("classpath*:spring/*.xml");
    }

    @Test
    public void daoSay() throws Exception {
        System.out.println(pmDao);
        pmDao.daoSay("gwc");
    }
}