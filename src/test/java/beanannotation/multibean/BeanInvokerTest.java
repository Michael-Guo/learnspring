package beanannotation.multibean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BeanInvokerTest {


    private ApplicationContext context;
    @Before
    public void before() {
        context = new  ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
    @Test
    public void say() throws Exception {
        BeanInvoker beanInvoker = (BeanInvoker) context.getBean("beanInvoker");
        beanInvoker.say();
    }

    @Test
    public void sayMap() throws Exception {
        BeanInvoker beanInvoker = (BeanInvoker) context.getBean("beanInvoker");
        beanInvoker.sayMap();
    }

}