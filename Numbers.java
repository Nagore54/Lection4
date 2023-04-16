package Lection4.java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int y = scanner.nextInt();

        int sum = 0;
        int sum1 = 0;
        byte maxDigit;
        maxDigit = (byte) (y % 10);

        while (y > 0) {
            sum += y % 10;
            y /= 10;

            if (y % 2 != 0) {
                sum1 += y;
                }
            }

            byte curDigit = (byte) (y % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            y /= 10;

            System.out.println("Сумма цифр числа = " + sum);
            System.out.println("Сумма нечетных цифр числа = " + sum1);
            System.out.println("Максимальная цифра числа = " + maxDigit);
        }
    }
