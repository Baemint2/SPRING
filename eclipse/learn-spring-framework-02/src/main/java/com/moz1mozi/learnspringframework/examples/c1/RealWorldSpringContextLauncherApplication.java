package com.moz1mozi.learnspringframework.examples.c1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;


	public DataService getDataService() {
		return dataService;
	}
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
	
	
}

//@Component
@Named
class DataService {
	
}

@Configuration
@ComponentScan
//@Qualifier("PackmanGame")
public class RealWorldSpringContextLauncherApplication {
	
	public static void main(String[] args) {

		try(var context =
				new AnnotationConfigApplicationContext
				(RealWorldSpringContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
//			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			
			System.out.println(context.getBean(BusinessService.class)
					.getDataService());
		}

	}

}
