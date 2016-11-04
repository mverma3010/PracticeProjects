package com.capgemini.view;

import com.capgemini.service.CustomerService;
import com.capgemini.service.CustomerServiceImpl;

public class CustomerView {
	public static void main(String[] args) {
		CustomerService custService = new CustomerServiceImpl();
		System.out.println("Customer Info : " +custService.findAll().get(0).getFirstName()+" "+custService.findAll().get(0).getLastName());
	}
}
