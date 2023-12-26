package com.moz1mozi.learnspringframework.examples.g1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
//@Qualifier("PackmanGame")
public class CdiContextLauncherApplication {
	
	public static void main(String[] args) {

		try(var context =
				new AnnotationConfigApplicationContext
				(CdiContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

		}

	}

}
