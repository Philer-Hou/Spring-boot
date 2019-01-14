package com.hourz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>加载初始化数据服务</p>
 * @author hourz
 * @since 2019-01-14
 */
@SpringBootApplication
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("加载初始化数据服务启动！");
		System.out.println("The service to start.");
		SpringApplication.run(Application.class, args);
		System.out.println("The service has started.");
		logger.info("加载初始化数据服务启动服务！");
	}
}
