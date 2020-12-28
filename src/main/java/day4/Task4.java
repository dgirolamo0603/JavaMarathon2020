package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[100];
        Random random = new Random();
        int max = 0;
        int imax = 0;

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(10001);
            if (arrayNumber[i] > max) {
                max = arrayNumber[i];
                imax = i;
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println(max + " " + imax);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = imax; j < arrayNumber.length; j++) {
                if (imax < arrayNumber[j]) {
                    max = arrayNumber[j];
                }
            }
            sum = sum + max;
        }
        System.out.println(sum);
        System.out.println(imax);
    }
}

