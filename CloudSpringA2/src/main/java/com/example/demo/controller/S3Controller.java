package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.S3Service;

@RestController
public class S3Controller {
	@Autowired

	private S3Service service;

	@GetMapping("/upload/{fileName}")
	public ResponseEntity<String> uploadFile(@PathVariable String fileName) {
		return new ResponseEntity<>(service.uploadFile(fileName), HttpStatus.OK);
	}
}
