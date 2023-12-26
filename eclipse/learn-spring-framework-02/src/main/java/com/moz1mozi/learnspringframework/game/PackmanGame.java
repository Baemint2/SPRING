package com.moz1mozi.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PackmanGameQualifier")
public class PackmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("Down");
	};
	public void left() {
		System.out.println("Turn Left");
	};
	public void right() {
		System.out.println("Turn Right");
	};

}
