package main;

public class OurThread2 implements Runnable{

    private String msg;

    public OurThread2() {
    }

    public OurThread2(String msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg);
    }
}
