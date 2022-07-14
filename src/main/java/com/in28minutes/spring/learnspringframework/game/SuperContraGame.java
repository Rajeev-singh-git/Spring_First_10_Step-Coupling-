package com.in28minutes.spring.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("Super jump");
	}
	
	public void down() {
		System.out.println("down into water");
	}
	
	public void left() {
		System.out.println("stop");
	}
	
	public void right() {
		System.out.println("acclerate and fire");
	}

}

