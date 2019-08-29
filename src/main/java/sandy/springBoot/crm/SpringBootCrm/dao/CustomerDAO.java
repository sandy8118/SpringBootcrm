package sandy.springBoot.crm.SpringBootCrm.dao;

import java.util.List;

import sandy.springBoot.crm.SpringBootCrm.entity.Customer;



public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
