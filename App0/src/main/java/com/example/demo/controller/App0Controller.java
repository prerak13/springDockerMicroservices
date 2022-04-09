package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class App0Controller {
	@GetMapping("/")
	public String func(@RequestParam String id) throws URISyntaxException {

		URI uriEmployee = new URI("http://employee:8081/Employees?id="+id);

		URI uriCustomers = new URI("http://customer:8082/Customers?id="+id);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		
		RestTemplate restTemplate = new RestTemplate();

		String result = id.contains("e") ? restTemplate.getForObject(uriEmployee, String.class)
				: (id.contains("c") ? restTemplate.getForObject(uriCustomers, String.class) : "Wrong Id Provided");

		
		return result;
	}
}
