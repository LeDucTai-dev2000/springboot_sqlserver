package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Customer;
import service.CustomerService;

@Controller
public class CustomerController {
	@Autowired CustomerService service;
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<Customer> listCustomers = service.listAll();
		model.addAttribute("listCustomers", listCustomers);
		return "index";
		
	}

}
