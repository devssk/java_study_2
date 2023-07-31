package algorithm;

public class BinarySearchProblem {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
        int target = 83;

        checkTarget(numbers, target);
    }

    public static boolean checkTarget(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;

        int temp = numbers[mid];

        boolean check = false;

        while (left <= right) {
            if (temp == target) {
                check = true;
                break;
            }

            if (temp > target) {
                right = mid + 1;
            }

            if (temp < target) {
                left = mid - 1;
            }
            mid = (left + right) / 2;
            temp = numbers[mid];
            System.out.println("left : " + left + ", right : " + right + ", mid : " + mid + ", temp : " + temp);
        }

        return check;
    }
}
