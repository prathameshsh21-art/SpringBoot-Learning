package com.learning.demo;

import com.learning.demo.game.GameRunner;
import com.learning.demo.game.MarioGame;
import com.learning.demo.game.SuperContraGame;

public class AppGamingBasic { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}
