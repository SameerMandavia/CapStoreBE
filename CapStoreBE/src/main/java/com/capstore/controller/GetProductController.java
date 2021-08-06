package com.capstore.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProductController {

	private static final Logger log = LoggerFactory.getLogger(GetProductController.class);

	@GetMapping(path = "/product/{productId}")
	public ResponseEntity<String> checkGetMapping(
			@PathVariable(value = "productId") @Valid @NotEmpty(message = "ProductID not empty") String productId) {
		log.info("GetProductController - checkGetMapping - START");
		
		log.info("GetProductController - checkGetMapping - END");
		return ResponseEntity.ok("Hello -get");
	}
}
