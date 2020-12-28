package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrayNumber = new int[12][8];
        int[] arraySum = new int[12];
        Random random = new Random();
        int sum = 0;
        int imax = 0;
        int max = arraySum[0];
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 8; j++) {
                arrayNumber[i][j] = random.nextInt(51);

                sum = arrayNumber[i][j] + sum;

            }
            if (sum > max) {
                max = sum;
                imax = i;
            }
            System.out.println(i + "  сумма " + sum);

        }


        System.out.println("Ответ: " + imax + " (индекс строки, сумма чисел в которой максимальна)");
    }

}
