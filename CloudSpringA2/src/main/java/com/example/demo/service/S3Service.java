package com.example.demo.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class S3Service {
	@Value("${region}")
	private String bucketName;

	@Autowired
	private AmazonS3 s3Client;

	public String uploadFile(String str) {

		s3Client.putObject(new PutObjectRequest(bucketName, "x", str));

		return "File uploaded : ";
	}

}
