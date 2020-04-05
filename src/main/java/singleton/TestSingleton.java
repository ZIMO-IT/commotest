package singleton;

import singleton.hungry.HungrySingleton;

public class TestSingleton {
    public static void main(String[] args){
        Thread thread=new Thread(new TestThread());
        Thread thread1=new Thread(new TestThread());
        thread.start();
        thread1.start();
    }
}
