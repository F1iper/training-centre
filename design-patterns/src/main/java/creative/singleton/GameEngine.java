package creative.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 2431531;

    private static GameEngine instance;
    private int hp = 100;
    private String characterName = "";

    private GameEngine() {

    }

    public static GameEngine getInstance() {
        if (instance == null)
            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        return instance;

    }

    protected Object readResolve() {
        return getInstance();
    }
//todo : 1/3 metodą aby uniknąć stworzenia więcej niż jednej instancji danej klasy jest słowo kluczowe
// synchronized - w takim przypadku do metody zostaje wpuszczony jeden wątek, reszta czeka.

//todo:  public synchronized GameEngine getInstance() {
//        if(instance == null) {
//            instance = new GameEngine();
//        }
//        return instance;
//    }

//todo: 2/3 metodą aby uniknąć stworzenia więcej niż jednej instancji danej klasy jest
// podwójny check - oznaczamy synchronized blok kodu odpowiedzialny za powtórne sprawdzenie
// czy instance == null, za wykonanie tego bloku kodu odpowiada jeden wątek.

//todo:    public GameEngine getInstance() {
//        if(instance ==null) {
//            synchronized (GameEngine.class){
//                if (instance == null) {
//                }
//            }
//        }
//        return instance;
//    }

    //todo: private static GameEngine instance2 = new GameEngine();
    //

    public void run() {
        while (true) {
            //waiting fot an input
            //change the state of game
            //render graphics
        }
    }
}
