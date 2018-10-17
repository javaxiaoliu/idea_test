package cc.bluemix.controller;

import cc.bluemix.domain.Customer;
import cc.bluemix.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuyang
 * @version 1.0
 * @description cc.bluemix.controller
 * @date 2018/10/15
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/input")
    public String input(){

        return "input";


    }

    @RequestMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "success";

    }
}
