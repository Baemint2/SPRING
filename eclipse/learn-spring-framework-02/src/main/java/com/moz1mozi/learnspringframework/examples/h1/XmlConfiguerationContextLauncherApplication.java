package com.moz1mozi.learnspringframework.examples.h1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@Qualifier("PackmanGame")
public class XmlConfiguerationContextLauncherApplication {
	
	public static void main(String[] args) {

		try(var context =
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

			System.out.println(context.getBean("name"));
		}

	}

}
