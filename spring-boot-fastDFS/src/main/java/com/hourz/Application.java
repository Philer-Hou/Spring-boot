package com.hourz;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

/**
 * <p>分布式文件系统</p>
 * @author hourz
 * @since 2019-01-14
 */
@SpringBootApplication
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class);
	
    public static void main(String[] args) throws Exception {
    	logger.info("启动文件上传服务！");
        SpringApplication.run(Application.class, args);
    }

    // Tomcat large file upload connection reset
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
                // -1 means unlimited
                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
            }
        });
        return tomcat;
    }

}