package com.example.demo.game.run;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Mario implements Gamingconsole{
 public void up() {
	  System.out.println("uper aaiye");
  }
 public void down() {
	  System.out.println("niche aaiye");
  }
 public void left() {
	  System.out.println("left aaiye");
  }
 public void right() {
	  System.out.println("right aaiye");
  }
   
}
