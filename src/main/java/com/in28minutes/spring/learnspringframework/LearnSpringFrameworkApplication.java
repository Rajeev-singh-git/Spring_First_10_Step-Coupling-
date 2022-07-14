package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.PacManGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext context
	= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
   
	//MarioGame game = new MarioGame();
    //SuperContraGame game = new SuperContraGame();
    
    //GamingConsole game = new PacManGame();
    //GameRunner runner = new GameRunner(game);
	
	GameRunner runner = context.getBean(GameRunner.class);
	
	runner.run();
    
	}

}
