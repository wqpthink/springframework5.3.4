package com.wqp.config;

import com.wqp.domain.User;
import com.wqp.postprocessor.MyImportBeanDefinitionRegistry;
import com.wqp.postprocessor.MyImportNon;
import com.wqp.postprocessor.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({MyImportSelector.class, MyImportBeanDefinitionRegistry.class, MyImportNon.class})
@ComponentScan(basePackages = {"com.wqp"})
@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig");
	}

	@Bean
	public User user(){
		return new User();
	}


}
