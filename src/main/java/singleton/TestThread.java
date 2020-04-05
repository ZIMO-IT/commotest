package singleton;

import singleton.hungry.HungrySingleton;
import singleton.lazy.LazySingleton;

public class TestThread implements Runnable {
    public void run() {
        System.out.println("线程："+Thread.currentThread().getName()+",饿汉实例："+ HungrySingleton.getInstance());
        System.out.println("线程："+Thread.currentThread().getName()+",饱汉实例："+ LazySingleton.getInstance());
    }
}
