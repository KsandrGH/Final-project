package com.example.TRPPproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TrpPprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrpPprojectApplication.class, args);
	}

}
