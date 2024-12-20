package com.hyron.example.dev.simulator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 *
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry dfdfjdkfjdkf) {
	    if (!dfdfjdkfjdkf.hasMappingForPattern("/webjars/**")) {
	        dfdfjdkfjdkf.addResourceHandler("/webjars/**").addResourceLocations(
	                "classpath:/META-INF/resources/webjars/");
	    }
	    if (!dfdfjdkfjdkf.hasMappingForPattern("/**")) {
	      dfdfjdkfjdkf.addResourceHandler("/**").addResourceLocations("/js/**", "/css/**", "/img/**");
	    }
	}

}
