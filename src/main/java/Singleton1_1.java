// 饿汉式 静态代码块
public  class Singleton1_1{
    private Singleton1_1(){}
    private staic Singleton1_1 instance;
    static {
        instance = new Singleton1_1();
    }
    //对外提供静态方法获取该对象
    public static Singleton1_1 getInstance(){
        return instance;
    }
}