package com.hourz.banner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Admin Banner服务</p>
 * @author hourz
 * @since 2019-01-14
 */
@SpringBootApplication
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("Admin服务端-监控中心----服务启动！");
		SpringApplication.run(Application.class, args);
	}
}
