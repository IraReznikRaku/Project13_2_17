package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class OurThread1 extends Thread {

    private String msg;

    public OurThread1(char c) {
    }

    public OurThread1(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RandomService.randomSymbolResults.add(msg);
    }
}
