package singleton.lazy;

public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        synchronized (LazySingleton.class) {
            if (null == lazySingleton) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
