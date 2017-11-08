package beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplOne")
    private BeanInterface beanInterface;

    public void say() {
        if (list != null) {
            for (BeanInterface bean: list) {
                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("list is null");
        }
    }

    public void sayMap() {
        if (map != null) {
            for (Map.Entry<String, BeanInterface>entry: map.entrySet()) {
                System.out.println(entry.getKey()+"   "+entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("map is null");
        }
        System.out.println(beanInterface.getClass().getName());
    }

}
