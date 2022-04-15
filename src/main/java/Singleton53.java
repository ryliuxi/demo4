//双重检查方式
public class Singleton53 {
    private Singleton53() {
    }

    private static Singleton instance;

    public static Singleton53 getInstance() {
        if (instance == null) {
            synchronized (Singleton53.class) {
                if (instance == null) {
                    instance = new Singleton53();

                }
            }

        }
        return instance;
    }
}

