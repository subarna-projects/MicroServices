package com.demo.microservice.envConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("env-service")
public class Configuration {
private String server;
private String id;
public String getServer() {
	return server;
}
public void setServer(String server) {
	this.server = server;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
}
