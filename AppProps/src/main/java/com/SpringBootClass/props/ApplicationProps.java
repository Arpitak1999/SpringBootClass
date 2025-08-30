package com.SpringBootClass.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@ConfigurationProperties(prefix = "app")
@Component
public class ApplicationProps {
	
	private Map<String, String> messages = new HashMap<>();
	

}
