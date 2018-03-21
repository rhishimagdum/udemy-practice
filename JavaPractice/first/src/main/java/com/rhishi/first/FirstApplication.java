package com.rhishi.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		//BinarySearchImpl b = new  BinarySearchImpl(new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(FirstApplication.class, args);
		BinarySearchImpl binarySearch =  applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {10, 2, 45}, 2);
		System.out.println(result);
	}
}
