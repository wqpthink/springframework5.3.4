package com.wqp.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class User implements BeanPostProcessor {

	private String name;

	public User() {
		System.out.println("User.User");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("User.postProcessBeforeInitialization");
		System.out.println("bean = " + bean + ", beanName = " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("User.postProcessAfterInitialization");
		System.out.println("bean = " + bean + ", beanName = " + beanName);
		return bean;
	}
}
