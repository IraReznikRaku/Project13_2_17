package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Before");

//        OurThread1 t1 = new OurThread1("1");
//        t1.start();
//        Thread t2 = new Thread(new OurThread2("2"));
//        t2.start();
//        OurThread1 t3 = new OurThread1("3");
//        t3.start();
//        Thread t4 = new Thread(new OurThread2("4"));
//        t4.start();

        System.out.println("Enter quantity:");
        int quantity = new Scanner(System.in).nextInt();
        StringBuffer sb = new StringBuffer(quantity);
        for (int i = 0; i < quantity; i++) {
            sb.append(RandomService.getRandomSymbol());
        }
        System.out.println("Your random string: " + sb);

//        char i = 65;
//        System.out.println(i);

    }
}
