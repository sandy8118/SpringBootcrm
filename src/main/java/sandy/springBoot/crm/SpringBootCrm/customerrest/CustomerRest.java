package sandy.springBoot.crm.SpringBootCrm.customerrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sandy.springBoot.crm.SpringBootCrm.entity.Customer;
import sandy.springBoot.crm.SpringBootCrm.service.CustomerService;

@RestController

@RequestMapping("/Customers")
public class CustomerRest {
@Autowired
private CustomerService customerService;
	
@GetMapping("/demo")
public String demo(){
	
	return "Demo Method";
	
}	

@GetMapping("/AllCustomers")
public List<Customer> getCustomers(){
	
	return customerService.getCustomers();
	
}	
	
	
}
