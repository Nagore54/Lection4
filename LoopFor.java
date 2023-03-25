public class LoopFor {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            double loop = getLoop(i);
            System.out.println(loop);
        }
    }

    public static double getLoop(int i) {
        int result = 0;
        if (i % 4 == 0) {
            result += i;
        }
        return result;
    }
}
