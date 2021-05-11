package com.idris.HRMSProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")
public class HrmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsProjectApplication.class, args);
	}

}
