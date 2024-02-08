package com.basicspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.game.run.Gamerunner;
import com.example.demo.game.run.Gamingconsole;
import com.example.demo.game.run.Mario;
import com.example.demo.game.run.PackMan;
import com.example.demo.game.run.SuperMario;

@Configuration
@ComponentScan("com.example.demo.game.run")
public class Gameconfig {
//	@Bean
//	public Gamerunner gamerun() {
//		return new Gamerunner(mar());
//	}
//	@Bean
//	public Gamerunner gamerun1() {
//		return new Gamerunner(sm());
//	}
//
//	@Bean
//	public Gamerunner gamerun2() {
//	return new Gamerunner(pac());
//	}
//	
//	@Bean
//	public Mario mar() {
//		return new Mario();
//	}
//
//	@Bean
//	public SuperMario sm() {
//		return new SuperMario();
//	}
//	@Bean
//	public PackMan pac() {
//		return new PackMan();
//	}
	
//	------------------------------------------
	
//	@Bean
//	public Gamerunner gamerun() {
//		return new Gamerunner(mar());
//	}
//	@Bean
//	@Primary
//	public Gamerunner gamerun1() {
//		return new Gamerunner(sm());
//	}
//
//	@Bean
//	@Qualifier("vikas")
//	public Gamerunner gamerun2() {
//	return new Gamerunner(pac());
//	}
//	
//	@Bean
//	public Mario mar() {
//		return new Mario();
//	}
//
//	@Bean
//	public SuperMario sm() {
//		return new SuperMario();
//	}
//	@Bean
//	public PackMan pac() {
//		return new PackMan();
//	}
//	-----------------------------------
//	by interfaces following this 
//	@Bean
//	public Gamerunner gamer(Gamingconsole game) {
//		return new Gamerunner(game);
//	}
//	@Bean
//	public Gamingconsole ga() {
//		return new Mario();
//	}
}
