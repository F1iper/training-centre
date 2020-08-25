package patterns.singleton;

public class Singleton {
    
    private static Singleton singletonInstance = null;
    
    private Singleton() {
    
    }
    
    public static Singleton getInstance(Singleton singleton) {
        if(singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null)
                    singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }

}
