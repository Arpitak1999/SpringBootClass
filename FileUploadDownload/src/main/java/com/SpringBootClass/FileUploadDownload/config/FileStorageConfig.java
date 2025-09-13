package com.SpringBootClass.FileUploadDownload.config;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;



@Configuration
public class FileStorageConfig {

	@Value("${file.upload-dir}")
	private String uploadDir;
	
	@PostConstruct
	private void init() {
		new File(uploadDir).mkdirs();
	}
}
