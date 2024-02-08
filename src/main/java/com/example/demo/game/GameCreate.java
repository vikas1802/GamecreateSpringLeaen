package com.example.demo.game;

import com.example.demo.game.run.Gamerunner;
import com.example.demo.game.run.Mario;
import com.example.demo.game.run.PackMan;
import com.example.demo.game.run.SuperMario;

public class GameCreate {
	public static void main(String [] args) {
//      var Mario = new Mario();
//		 var SuperMario = new SuperMario();
//		var PackMan = new PackMan();
//      var Gamerunner = new Gamerunner(Mario);
//		 var Gamerunner1 = new Gamerunner(SuperMario);
//		var Gamerunner2 = new Gamerunner(PackMan);
//		Gamerunner.run();
//  	Gamerunner1.run();
//  	Gamerunner2.run();
//		tight coupled tino method chlane h isliye tino k object run kiye
//		ek class run krni hoti to yha dekhe
//      var Mario = new Mario();
//		  var Gamerunner = new Gamerunner(Mario);
//		Gamerunner.run();
//		-------------------------------------
		
//		var sm = new Mario();
//		var smt = new SuperMario();
//		var sma = new PackMan();
//		var Gamerunner = new Gamerunner(sm);
//		var Gamerunner1 = new Gamerunner(smt);
//		var Gamerunner2 = new Gamerunner(sma);
//      	Gamerunner.run();
//      	Gamerunner1.run();
//      	Gamerunner2.run();
//		loose coupled tino method chlane h isliye tino k object run kiye
//		ek class run krni hoti to yha dekhe
		var ma = new Mario();
		var Gam = new Gamerunner(ma);
		Gam.run();
//		--------------------------------------
		
}
}
