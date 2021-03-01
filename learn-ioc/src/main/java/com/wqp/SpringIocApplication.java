package com.wqp;

import com.wqp.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(context.getBean("user"));


	}


}
