package com.hourz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>DockerCompose启动主函数</p>
 * @author hourz
 * @since 2019-01-10
 */
@SpringBootApplication
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class); 
	
	public static void main(String[] args) {
		logger.info("DockerCompose启动主");
		SpringApplication.run(Application.class, args);
	}
}
