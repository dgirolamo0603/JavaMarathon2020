package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.printf("%.0f %.0f - ваш ввод в консоль \n", x, y);
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double res = x / y;
            System.out.println(res + " - ответ программы");


        }
    }
}
