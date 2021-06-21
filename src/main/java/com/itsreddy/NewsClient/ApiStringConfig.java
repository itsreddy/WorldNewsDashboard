package com.itsreddy.NewsClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiStringConfig {
	
	// passing the key which you set in application.properties
	@Value("${newsapikey}")
	private String apiString;
	
	// getting the value from that key which you set in application.properties
	@Bean
	public String getApiString() {
		return apiString;
	}
	
}
