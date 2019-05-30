package io.github.mjyoun.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "second-service")
public interface SecondServerClient {

	@RequestMapping(path = "/health_check", method = RequestMethod.GET)
	public String checkHealth();
	
}
