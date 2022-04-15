// 懒汉式 线程安全
public class Singleton3 {
    //私有构造方法
    private Singleton3 (){}
    //在成员位置创建该对象
    private static Singleton instance;
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}