package service;

import dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Guo on 2017/8/27.
 */
@Component
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

//    public void setCustomerDao(CustomerDao customerDao) {
//        this.customerDao = customerDao;
//    }

    @Override
    public String toString() {
        return "CustomerService [customerdao" + customerDao + "]";
    }
}
