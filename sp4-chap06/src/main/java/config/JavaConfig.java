package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client2;
import spring.Client3;

@Configuration
public class JavaConfig {
	
	@Bean(destroyMethod="close")
	public Client3 client3() throws Exception {
		Client3 client3 = new Client3();
		client3.setHost("서버3");
		client3.connect();
		return client3;
	}

}
