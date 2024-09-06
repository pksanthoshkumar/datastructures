package org.opendesk.gof;

public class Singleton {
    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton () {}
}

class SingletonDemo {
    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        Singleton single3 = Singleton.getInstance();

        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
        System.out.println(single3.hashCode());
    }
}