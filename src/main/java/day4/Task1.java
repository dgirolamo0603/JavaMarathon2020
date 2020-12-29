package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arrayNumbers = new int[number];

        Random numberRandom = new Random();
        int count = 0;
        int countFirst = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;


        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = numberRandom.nextInt(11);
            if (arrayNumbers[i] > 8) {
                count++;
            }
            if (arrayNumbers[i] == 1) {
                countFirst++;
            }
            if (arrayNumbers[i] % 2 == 0) {
                countEven++;
            }
            if (arrayNumbers[i] % 2 != 0) {
                countOdd++;
            }
            sum = sum + arrayNumbers[i];


        }

        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("Длина массива: " + arrayNumbers.length);
        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел равных 1: " + countFirst);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
