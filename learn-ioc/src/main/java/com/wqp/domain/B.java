package com.wqp.domain;

import org.springframework.stereotype.Component;

@Component
public class B {

	public B(A a) {
		System.out.println("B#B======================= a = " + a);
	}
}
