package algorithm;

public class MinMaxProblem {
    public static void main(String[] args) {
        int numbers[] = {21, 5, 7, 105, 1, 6, 33, 99, 87};

        int max = numbers[0];
        int min = numbers[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }
            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("max number : " + max + ", index : " + maxIndex);
        System.out.println("min number : " + min + ", index : " + minIndex);
    }
}
