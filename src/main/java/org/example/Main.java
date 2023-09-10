package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<String> names = Arrays.asList("Tigran-1", "Timur-2", "Twix-3", "Temy-4");
        ThreadGroup mainGroup = new ThreadGroup("main group");
        names.forEach(name -> new MyThread(mainGroup, name).start());
        Thread.sleep(15000);

        mainGroup.interrupt();
    }
}