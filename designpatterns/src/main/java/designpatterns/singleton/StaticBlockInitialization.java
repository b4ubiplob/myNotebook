package designpatterns.singleton;

public class StaticBlockInitialization {
    
    private static StaticBlockInitialization INSTANCE;
    
    private StaticBlockInitialization() {}
    
    static {
        try {
            INSTANCE = new StaticBlockInitialization();
        }
        catch (Exception e) {
            throw new RuntimeException("Error creating a singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance() {
        return INSTANCE;
    }

}
