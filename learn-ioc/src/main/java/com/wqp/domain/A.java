package com.wqp.domain;

import org.springframework.stereotype.Component;

@Component
public class A {

	public A(B b) {
		System.out.println("A#A======================= b = " + b);
	}
}
