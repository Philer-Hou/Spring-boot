package cloud.config.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Eureka的客户端
 * @author hourz
 * @since 2018-01-08
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

	@RequestMapping("/")
    public String home() {
        return "Hello world";
    }
	@Autowired  
    private DiscoveryClient discoveryClient;
	//
	@RequestMapping("/registered")  
    public String getRegistered(){  
        List<ServiceInstance> list = discoveryClient.getInstances("STORES");  
        System.out.println(discoveryClient.getLocalServiceInstance());  
        System.out.println("discoveryClient.getServices().size() = " + discoveryClient.getServices().size());  
          
        for( String s :  discoveryClient.getServices()){  
            System.out.println("services " + s);  
            List<ServiceInstance> serviceInstances =  discoveryClient.getInstances(s);  
            for(ServiceInstance si : serviceInstances){  
                System.out.println("    services:" + s + ":getHost()=" + si.getHost());  
                System.out.println("    services:" + s + ":getPort()=" + si.getPort());  
                System.out.println("    services:" + s + ":getServiceId()=" + si.getServiceId());  
                System.out.println("    services:" + s + ":getUri()=" + si.getUri());  
                System.out.println("    services:" + s + ":getMetadata()=" + si.getMetadata());  
            }
        }  
          
        System.out.println(list.size());  
        if (list != null && list.size() > 0 ) {  
            System.out.println( list.get(0).getUri());  
        }  
        return null;  
    } 
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
