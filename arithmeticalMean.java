package Lecrion4;

public class arithmeticalMean {
    public static void main(String[] args) {
        double[] nums = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        double result = 0;

        for (double i : nums) {
            result += i;
        }
        System.out.println("Среднее арифметическое = " + result / nums.length);

        int oddsCount = 0;
        int sum = 0;
        for (double p : nums) {
            if (p % 2 == 0) {
                sum += p;
                oddsCount++;
            }
        }
        System.out.println("Среднее арифметическое четных чисел = " + sum / oddsCount);

    }
}
