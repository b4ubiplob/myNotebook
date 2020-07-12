package designpatterns.singleton;

public class ThreadSafeSingleton {
    
    
    private static ThreadSafeSingleton INSTANCE;
    
    private ThreadSafeSingleton() {}
    
    public static ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeSingleton.class) {
                INSTANCE = new ThreadSafeSingleton();
            }
        }
        return INSTANCE;
    }

}
