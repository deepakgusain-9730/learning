package SingletonPattern;

public class Singleton {

    static DbConnection instance = null;
    private Singleton() {}

    public static class SingletonHolder {
        private static final DbConnection instance = DbConnection.getInstance();
    }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = SingletonHolder.instance;
        }
        return instance;
    }
}
