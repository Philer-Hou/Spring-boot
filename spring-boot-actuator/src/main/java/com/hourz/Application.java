package com.hourz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>服务监控与管理</p>
 * @author hourz
 * @since 2019-01-11
 */
@SpringBootApplication
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class); 
	
	/**
	 * <p>服务监控与管理服务主函数</p>
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("服务监控与管理服务----启动！");
		SpringApplication.run(Application.class, args);
	}
}
