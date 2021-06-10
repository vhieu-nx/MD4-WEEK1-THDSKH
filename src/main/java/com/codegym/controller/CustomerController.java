package com.codegym.controller;

import com.codegym.controller.model.Customer;
import com.codegym.controller.service.CustomerService;
import com.codegym.controller.service.CustomerServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
private CustomerService customerService = CustomerServiceFactory.getInstance();

    @GetMapping("/customers")
    public ModelAndView showList() {

        ModelAndView modelAndView = new ModelAndView("views/list.jsp");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
