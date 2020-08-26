package com.example.netflixzuulservice;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulFilterProxy extends ZuulFilter{

	private Logger logger= LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		// To execute for all requests
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// MainMethod
		HttpServletRequest request= RequestContext.getCurrentContext().getRequest();
		logger.info("Request -> {} Request URI -> {}" ,request ,request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		// To execute filter before request
		return "pre";
	}

	@Override
	public int filterOrder() {
		// To set priority order
		return 1;
	}

}
