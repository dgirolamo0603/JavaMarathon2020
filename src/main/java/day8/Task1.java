package day8;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        Date currentTime = new Date();

        for (int i = 0; i <= 20000; i++) {
            s.append(i + " ");
        }

        System.out.println(s);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();


        Date currentTimeS = new Date();
        String s1 = "";
        for (int i = 0; i <= 20000; i++) {
            s1 += (i + " ");
        }
        System.out.println(s1);

        Date newTimeS = new Date();
        long msDelay1 = newTimeS.getTime() - currentTimeS.getTime();

        System.out.println(msDelay);
        System.out.println(msDelay1);
    }
}
