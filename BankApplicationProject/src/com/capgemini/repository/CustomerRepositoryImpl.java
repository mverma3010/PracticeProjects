package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.capgemini.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Sakshi");
		customer.setLastName("Malik");
		customers.add(customer);
		return customers;
	}
	
	public int widthdrawAmount(int accountNum, int requestedAmount){
		
		
		return requestedAmount;
		
	}

}
