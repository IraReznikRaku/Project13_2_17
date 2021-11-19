package main;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RandomService {

    public static List<String> randomSymbolResults = new CopyOnWriteArrayList<>();

    public static String getRandomSymbol() {
        List<Thread> threads = new LinkedList<>();
        for (Integer i = 0; i < 10; i++) {
            OurThread1 t = new OurThread1(i.toString());
            threads.add(t);
        }
// Т.е. в конце цикла мы имеем threads, наполненный нужными цифрами от щ до 9 в формате строки

        threads.add(new OurThread1("_"));
        threads.add(new OurThread1("$"));

//        char[] charArr = new char[1];
//        int j = 0;
//        for (char c = 'a', cc = 'A'; j < 26; j++, c++, cc++) {
//            charArr[0] = c;
//            String cs = new String(charArr);
//            threads.add(new OurThread1(cs));
//            charArr[0] = cc;
//            cs = new String(charArr);
//            threads.add(new OurThread1(cs));
//        }
        char chArr[] = new char[1];
        char chArr1[] = new char[1];
        for (chArr[0] = 65, chArr1[0] = 97; chArr[0] <= 90 && chArr1[0] <= 122; chArr[0]++, chArr1[0]++) {
            String cs = new String(chArr);
            threads.add(new OurThread1(cs));
            cs = new String(chArr1);
            threads.add(new OurThread1(cs));
        }

//        byte[] byteArr = new byte[1];
//        int j = 0;
//        for (byte b = 65, bb = 97; j < 26; j++, b++, bb++) {
//            byteArr[0] = b;
//            String bs = new String(byteArr);
//            threads.add(new OurThread1(bs));
//            byteArr[0] = bb;
//            bs = new String(byteArr);
//            threads.add(new OurThread1(bs));
//        }

        for (Thread th : threads) {
            th.start();
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = randomSymbolResults.get(30);
        randomSymbolResults.clear();
        return result;
    }
}
