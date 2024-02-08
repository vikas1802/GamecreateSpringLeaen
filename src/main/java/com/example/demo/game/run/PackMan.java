package com.example.demo.game.run;

import org.springframework.stereotype.Component;

@Component("vikas")
public class PackMan implements Gamingconsole {
	 public void up() {
		  System.out.println("uper aaiye pack");
	  }
	 public void down() {
		  System.out.println("niche aaiye pack");
	  }
	 public void left() {
		  System.out.println("left aaiye pack");
	  }
	 public void right() {
		  System.out.println("right aaiye pack");
	  }
}
