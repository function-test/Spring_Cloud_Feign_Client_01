package io.github.mjyoun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.mjyoun.client.SecondServerClient;

@RestController
public class Controller {

	@Autowired
	private SecondServerClient ssClient;
	
	@RequestMapping(path = "/health_check/second_server")
	public ResponseEntity<String> checkSecondServer() {
		return ResponseEntity.ok(ssClient.checkHealth());
	}
	
}
