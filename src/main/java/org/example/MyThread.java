package org.example;

import java.util.Random;

public class MyThread extends Thread {
    private final static Random random = new Random();

    public MyThread(ThreadGroup mainGroup, String s) {
        super(mainGroup, s);
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            System.out.println("Hello everyone! I am thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(random.nextInt(2000, 3000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("%s zavershen\n", Thread.currentThread().getName());
    }
}
