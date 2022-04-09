package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;

@RestController
public class CustomerController {
	private static final String COMMA_DELIMITER = ",";
	@GetMapping("/Customers")
	Customer getCustomerDetails(@RequestParam String id) throws FileNotFoundException, IOException {
		Customer c = null;
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/customer.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				if (values[0].equals(id)) {
					c = new Customer(values[0], values[1]);
				}
			}
		}
		c = c == null ? new Customer( "Error: Value not found") : c;
		return c;
	}
}
