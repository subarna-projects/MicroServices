package com.demo.microservice.envConfig;


public class EnvBean {
	private String server;
	private String id;
public EnvBean() {
		
		this.server = server;
		this.id = id;
	}
	public EnvBean(String server, String id) {
		
		this.server = server;
		this.id = id;
	}
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
