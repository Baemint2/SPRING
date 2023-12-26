package com.moz1mozi.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(@Qualifier("PackmanGameQualifier") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		
		System.out.println("게임 실행: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
