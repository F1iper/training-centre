package creative.singleton;

public enum GameEngineEnum {
//todo: 3/3 użycie enuma powoduje, że singleton jest zabezpieczony przed serializacją, wielowątkowością,
// refleksją, dla każdego typu enuma powinna być jedna instancja, odpowiada za to JVM
    INSTANCE("");

    private int hp = 100;
    private String name = "";

    GameEngineEnum(String name){
        this.name = name;
    }

    public void run() {
        while(true) {
            //input from player
            //change state of game
            //render the graphic
        }
    }
}
