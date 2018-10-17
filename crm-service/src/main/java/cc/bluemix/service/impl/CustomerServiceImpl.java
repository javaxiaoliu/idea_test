package cc.bluemix.service.impl;

import cc.bluemix.domain.Customer;
import cc.bluemix.mapper.CustomerMapper;
import cc.bluemix.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liuyang
 * @version 1.0
 * @description cc.bluemix.service.impl
 * @date 2018/10/15
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public void save(Customer customer) {
        customerMapper.save(customer);
    }
}
