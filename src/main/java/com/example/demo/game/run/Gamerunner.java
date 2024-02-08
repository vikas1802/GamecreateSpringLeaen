package com.example.demo.game.run;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gamerunner {
// private Mario mar;
//	 private SuperMario sm;
//	 private PackMan pack;
//	create variable because tightcoupling
	 private Gamingconsole game;
//		create variable because loosecoupling
 
// public Gamerunner(SuperMario sma) {
//	 this.sm = sma;
// }
	 
//	 public void run() {
//			sm.up();
//			sm.down();
//			sm.left();
//			sm.right();
//		 }
// public Gamerunner(Mario ma) {
//	 this.mar = ma;
// }
	 
//	 public void run() {
//			mar.up();
//			mar.down();
//			mar.left();
//			mar.right();
//		 }
// public Gamerunner(PackMan pac) {
//	 this.pack = pac;
// }
	 
//	 public void run() {
//			pack.up();
//			pack.down();
//			pack.left();
//			pack.right();
//		 }
//	 Its called tightcoupling
//	 ---------------------------
	 public Gamerunner (@Qualifier("vikas") Gamingconsole gam) {
		 this.game = gam;
	 }
 public void run() {
	game.up();
	game.down();
	game.left();
	game.right();
 }
//	 its called loose coupling
//	 ---------------------------
}
