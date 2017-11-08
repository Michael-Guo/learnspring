package beanannotation.javabased;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StoreConfigTest {
    private ApplicationContext context;
    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
    @Test
    public void getStringStore() throws Exception {
        Store store = (Store) context.getBean("store");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void getMyDriverManager() {
        MyDriverManager myDriverManager = (MyDriverManager)context.getBean("myDriverManager");
    }

}