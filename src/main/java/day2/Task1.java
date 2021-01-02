package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //System.out.println("Введите количество этажей:");
        int a = number.nextInt();
        if (a >= 1 && a <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (a >= 5 && a <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (a >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
