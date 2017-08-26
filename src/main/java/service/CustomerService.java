package service;

import dao.CustomerDao;

/**
 * Created by Michael Guo on 2017/8/27.
 */
public class CustomerService {
    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public String toString() {
        return "CustomerService [customerdao" + customerDao + "]";
    }
}
