package org.opendesk.thread;

import java.util.List;
import java.util.stream.IntStream;

public class VirtualThreadPerformance {
    public static void main(String[] args) throws InterruptedException {

        List <Thread> threads = IntStream.range(0, 10).mapToObj(i-> Thread.ofVirtual().unstarted(
                ()-> {
                    if (i==0){
                        System.out.println(Thread.currentThread());
                    }
                    try {
                        Thread.sleep(10);
                    }catch (Exception e){

                    }
                    if (i==0){
                        System.out.println(Thread.currentThread());
                    }
                }
        )).toList();

        threads.forEach(t->t.start());

        for (Thread t : threads){
            t.join();
        }
    }
}
