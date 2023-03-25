import java.util.Scanner;

public class ArithmeticalMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите наименьшее число диапазона: ");
        int a = scanner.nextInt();

        System.out.println("Введите наибольшее число диапазона: ");
        int y = scanner.nextInt();

        int i;
        double sum = 0;
        double sum1 = 0;
        int numbersCount = 0;
        int oddsCount = 0;

        for (i = a; i <= y; i++) {
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
