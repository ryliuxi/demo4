// 饿汉式 静态代码块
public  class Singleton1{
    private Singleton1(){}
    private staic Singleton instance;
    static {
        instance = new Singleton1();
    }
    //对外提供静态方法获取该对象
    public static Singleton1 getInstance(){
        return instance;
    }
}
