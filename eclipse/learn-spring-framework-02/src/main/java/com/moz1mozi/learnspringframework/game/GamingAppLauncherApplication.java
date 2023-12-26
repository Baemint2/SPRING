package com.moz1mozi.learnspringframework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.moz1mozi.learnspringframework.game")
//@Qualifier("PackmanGame")
public class GamingAppLauncherApplication {
	
	
	public static void main(String[] args) {

		try(var context =
				new AnnotationConfigApplicationContext
				(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}