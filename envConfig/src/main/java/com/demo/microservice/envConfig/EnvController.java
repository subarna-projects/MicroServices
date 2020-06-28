package com.demo.microservice.envConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/env")
	public EnvBean getEnvProperties()
	{
		EnvBean env=new EnvBean(configuration.getServer(),configuration.getId());
		return env;
		
	}

}
