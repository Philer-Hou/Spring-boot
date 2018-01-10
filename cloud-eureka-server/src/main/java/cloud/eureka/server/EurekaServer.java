package cloud.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
/**
 * 服务
 * @author hourz
 * @since 2018-01-08
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
