package com.hourz;

import de.codecentric.boot.admin.config.EnableAdminServer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Admin Server服务端端</p>
 * @author hourz
 * @since 2019-01-11
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class); 
	
	public static void main(String[] args) {
		logger.info("Admin服务端-监控中心----服务启动！");
		SpringApplication.run(Application.class, args);
	}
}
