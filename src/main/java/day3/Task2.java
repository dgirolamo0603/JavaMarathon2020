package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.printf("%.0f %.0f - ваш ввод в консоль \n", x, y);
            if (y == 0) break;
            double res = x / y;
            System.out.println(res + " - ответ программы");


        }
    }
}
