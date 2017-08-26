package dao;

import org.springframework.stereotype.Repository;

/**
 * Created by nangu on 2017/8/24.
 */
@Repository
public class PmDao {
    public void daoSay(String name) {
        System.out.println("dao say:"+name);
    }
}
