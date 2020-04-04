package com.pwc.pfg.Ticker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication (scanBasePackages = "com.pwc.pfg.*")
@EnableJpaRepositories(basePackages="com.pwc.pfg.repository")
@EntityScan(basePackages =  "com.pwc.pfg.model")
public class TickerApplication {
	public static void main(String[] args) {
		SpringApplication.run(TickerApplication.class, args);
	}

}
