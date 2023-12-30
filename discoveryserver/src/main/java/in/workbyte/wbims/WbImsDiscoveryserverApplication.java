package in.workbyte.wbims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableEurekaServer
@SpringBootApplication
@EnableWebSecurity
public class WbImsDiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WbImsDiscoveryserverApplication.class, args);
	}

}
