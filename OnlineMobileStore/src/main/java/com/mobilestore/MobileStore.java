package com.mobilestore;




	import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


	@SpringBootApplication(scanBasePackages = { "com.mobilestore.controller", "com.mobilestore.service", "com.mobilestore.dao" })
	@EnableJpaRepositories("com.mobilestore.dao")
	@EntityScan("com.mobilestore.entity")
	public class MobileStore {
		public static void main(String[] args) {
			SpringApplication.run( MobileStore .class, args);
		}
	
}


		


