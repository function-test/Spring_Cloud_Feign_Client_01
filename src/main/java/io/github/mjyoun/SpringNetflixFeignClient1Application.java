package io.github.mjyoun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringNetflixFeignClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringNetflixFeignClient1Application.class, args);
	}

}


