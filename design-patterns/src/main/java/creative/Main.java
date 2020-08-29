package creative;

import creative.singleton.GameEngine;
import creative.singleton.thegame.GuessGame;

public class Main {
    public static void main(String[] args) {

        GuessGame game = GuessGame.getInstance();


        GameEngine gameEngine1 = GameEngine.getInstance();
        GameEngine gameEngine2 = GameEngine.getInstance();
        System.out.println(gameEngine1==gameEngine2);
    }
}
