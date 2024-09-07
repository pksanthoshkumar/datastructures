package org.opendesk.thread;


public class VirtualThreadTest {

    public static void main(String[] args) throws InterruptedException {

        Thread platform  = Thread.ofPlatform().unstarted(()->System.out.println("Platform Thread"));
        Thread virtual    = Thread.ofVirtual().unstarted(()-> System.out.println("I am Virtual"));

        platform.start();
        virtual.start();

        virtual.join();
        platform.join();
    }
}
