package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

@RestController
public class EmployeeController {
	private static final String COMMA_DELIMITER = ",";
	@GetMapping("/Employees")
	Employee getEmpDetails(@RequestParam String id) throws FileNotFoundException, IOException {
		Employee e = null;
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/employee.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				if (values[0].equals(id)) {
					e = new Employee(values[0], values[1]);
				}
			}
		}
		e = e == null ? new Employee( "Error: Value not found") : e;
		return e;
	}
}
