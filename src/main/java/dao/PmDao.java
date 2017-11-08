package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by nangu on 2017/8/24.
 */
@Scope
@Component
public class PmDao {
    @Autowired(required = false)
    private CustomerDao customerDao;
    /**
     * @param name
     */
    public void daoSay(String name) {
        System.out.println("dao say:"+name);
        customerDao.toSay();
    }
}
