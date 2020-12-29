package day4;

import java.util.Random;
//
//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Затем, используя циклы for each вывести в консоль:
//        наибольший элемент массива
//        наименьший элемент массива
//        количество элементов массива, оканчивающихся на 0
//        сумму элементов массива, оканчивающихся на 0
//
//        Использовать сортировку запрещено.


public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //int max =numbers[0];
        //int min = numbers[0];
        int counter = 0;
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000 + 1);
        }
        for (int x : numbers
        ) {
            if (x > max) {
                max = x;
            }
        }
        for (int y : numbers
        ) {
            if (y < min) {
                min = y;
            }
        }
        for (int x : numbers
        ) {
            if (x % 10 == 0) {
                counter++;
                sum = sum + x;
            }

        }

        System.out.println(max + " - наибольший элемент массива");
        System.out.println(min + " - наименьший элемент массива");
        System.out.println(counter + " - количество элементов массива, оканчивающихся на 0");
        System.out.println(sum + " - сумму элементов массива, оканчивающихся на 0");
    }
}
