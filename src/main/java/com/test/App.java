package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Member;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Member m = (Member) applicationContext.getBean("member");
		System.out.println(m);

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean.xml");
		Member mbean = (Member) beanFactory.getBean("member");
		System.out.println(mbean);
	}
}
