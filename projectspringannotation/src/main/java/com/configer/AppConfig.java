package com.configer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Samsung;
@Configuration
public class AppConfig {

	@Bean
	public Samsung getPhoneInfo()
	{
		return new Samsung();
	}
}
