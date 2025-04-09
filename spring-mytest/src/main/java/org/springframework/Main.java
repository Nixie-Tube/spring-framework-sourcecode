package org.springframework;

import org.springframework.bean.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cat bean = context.getBean(Cat.class);
		System.out.println(bean);
	}
}
