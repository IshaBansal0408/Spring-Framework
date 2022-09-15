package com.noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.noXML")
public class JavaConfig {

	@Bean
	public Song getSong() {
		return new Song();
	}

	@Bean
	public Movie getMovie() {
//		Creating a new Object
		return new Movie(getSong());
	}

}
