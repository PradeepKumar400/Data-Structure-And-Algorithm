public class FindMAX {
    public static int max(int[] num) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        return max;
    }

    public static void main(String args[]) {
        int[] num = { -12, -45, -2, -67, -34, -89, -23 };
        int res = (max(num));
        System.out.println(res);
    }
}


/* Requirements:

Store your numbers in an array, e.g. int[] nums = {12, 45, 2, 67, 34, 89, 23};
Create a variable max, initialized to Integer.MIN_VALUE (the smallest possible int value) instead of nums[0].
Use a for loop to go through every element of the array, starting from index 0.
On each iteration, if the current element is greater than max, update max to that value.
After the loop finishes, print max.
Test with: nums = {12, 45, 2, 67, 34, 89, 23} → expected output 89.
Handle the edge case of an array with only one element, e.g. {5} → expected output 5.
 */