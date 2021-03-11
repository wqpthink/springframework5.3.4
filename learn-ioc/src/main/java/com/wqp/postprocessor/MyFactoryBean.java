package com.wqp.postprocessor;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<Object> {


	@Override
	public Object getObject() throws Exception {
		System.out.println("MyFactoryBean.getObject");
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("MyFactoryBean.getObjectType");
		return null;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
