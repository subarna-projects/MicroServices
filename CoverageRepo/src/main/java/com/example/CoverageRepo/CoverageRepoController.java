package com.example.CoverageRepo;

import java.math.BigDecimal;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoverageRepoController {
	
	@Autowired
	private CoverageRepository repository;
	@GetMapping("/retrunInterestService/{premium}/for/{year}")
	public CoverageRepoBean retrunInterest(@PathVariable long premium ,@PathVariable int year ){
		
		return repository.findByPremiumAndYear(premium,year);
		
	}

}
