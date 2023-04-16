package Lection4.java;

import java.util.Scanner;

public class AverageMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int a = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int b = scanner.nextInt();

        int sum = 0;
        int sum1 = 0;
        int numbersCount = 0;
        int oddsCount = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            numbersCount++;

            if (i % 2 == 0) {
                sum1 += i;
                oddsCount++;
            }
        }
        System.out.println("Среднее арифметическое: " + sum/numbersCount);

        System.out.println("Среднее арифметическое четных чисел: " + sum1/oddsCount);
    }
}
