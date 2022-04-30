package pe.garcia.agora.java.ms.customers.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class GlobalConfiguration {

	public GlobalConfiguration() {
		
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	
}
