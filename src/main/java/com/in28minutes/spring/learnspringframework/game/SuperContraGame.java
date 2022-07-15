package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //when we have multiple matching components, we can use @Primary to define, what we want to Autowire
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

