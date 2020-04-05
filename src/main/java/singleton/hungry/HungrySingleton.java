package singleton.hungry;

/**
 * 优点：执行效率高，没有锁，性能高
 * 缺点：存在大量的单例类的时候，会严重浪费内存，因为用不用都在类加载的时候就初始化该单例
 */
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
