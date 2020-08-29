package creative.singleton.thegame;

public class GuessGame {

    private static GuessGame instance;
    private int score;

    public static GuessGame getInstance() {
        if(instance == null) {
            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

    public void play() {
        //logic
    }
    public int getScore(){
        return score;
    }
}
