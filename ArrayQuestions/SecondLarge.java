public class SecondLarge {
    static void secondlargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                seclargest = largest;
                largest = num[i];
            } else if (num[i] > seclargest && num[i] != largest) {
                seclargest = num[i];
            }
        }
        if (seclargest == Integer.MIN_VALUE) {
            System.out.println("no second largest");

        } else {
            System.out.println("second largest number is :" + seclargest);
        }

    }

    public static void main(String args[]) {
        int num[] = { -10, -10 };
        secondlargest(num);

    }
}

/*
 * Requirements:
 * 
 * Store your numbers in an array, e.g. int[] nums = {12, 35, 1, 10, 34, 1};
 * Create two variables, first and second, both initialized to Integer.MIN_VALUE
 * (the smallest possible value, so any real number in the array will beat it).
 * Use a for-each loop (for (int num : nums)) to go through every element.
 * On each iteration, check if the current num is greater than first:
 * If yes: before updating first, save its old value into second (second =
 * first;), then set first = num;. This way, the old largest "moves down" to
 * become the second largest.
 * If num is not greater than first, check an else if: is num greater than
 * second, and not equal to first? If both are true, update second = num;
 * The num != first check matters so a repeated value (like two 5s) doesn't get
 * wrongly counted as both the largest and second largest.
 * After the loop ends, return/print second.
 * Test with: nums = {12, 35, 1, 10, 34, 1} → expected output 34.
 * Test the edge case where all elements are the same, e.g. {5, 5, 5} → trace it
 * by hand — what does second end up being, and why?
 */