package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("pac go up");
	}
	
	public void down() {
		System.out.println("pac go down");
	}
	
	public void left() {
		System.out.println("pac stop");
	}
	
	public void right() {
		System.out.println("pac acclerate");
	}

}
