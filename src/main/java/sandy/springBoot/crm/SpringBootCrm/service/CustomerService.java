package sandy.springBoot.crm.SpringBootCrm.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import sandy.springBoot.crm.SpringBootCrm.entity.Customer;



public interface CustomerService extends JpaRepository<Customer, Integer>{
	
}
