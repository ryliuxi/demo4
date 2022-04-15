public class Singletonvol {
    private Singletonvol(){}
    private static volatile Singletonvol instance;
    public static Singletonvol getInstance(){
        if(instance == null){
            synchronized (Singletonvol.class){
                if(instance == null){
                    instance = new Singletonvol();
                }
            }
        }
        return instance;
    }
}
