package service;

import dao.PmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nangu on 2017/8/24.
 */
@Service
public class PmService {

    private PmDao pmDao;


    @Autowired
    public PmService(PmDao pmDao) {
        this.pmDao = pmDao;
    }
    public void say(String name) {
        System.out.println("service say:"+name);
        pmDao.daoSay(name);
    }
}
