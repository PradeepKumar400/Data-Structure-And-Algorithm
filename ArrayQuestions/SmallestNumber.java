public class SmallestNumber {
    public static void main(String[] args) {
        int[] num = { 5, 2, 8, 2, 1, 9, 1, 1 };
        int min = num[0];
        int minIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                minIndex = i;
            }
        }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == min) {
                count++;
            }
        }
        System.out.println("The smallest number is " + min);
        System.out.println("First Index = " + minIndex);
        System.out.println("The smallest number appears " + count + " times");
    }
}

/*
 * Goal: Given an array of integers, find the smallest element — and also its
 * index and how many times it appears in the array.
 * 
 * Requirements:
 * 
 * 1.Store your numbers in an array, e.g. int[] nums = {5, 2, 8, 2, 1, 9, 1, 1};
 * 2.Create a variable min, initialized to the first element of the array
 * (nums[0]), and a variable minIndex, initialized to 0.
 * 3.Use a for loop to go through the remaining elements (starting from index 1).
 * 4.On each iteration, if the current element is smaller than min, update both
 * min and minIndex to the current value/index.
 * 5.After finding the smallest value, run a second loop through the array to
 * 6.Print all three results: the smallest value, the first index it occurs at,
 * and the total count of occurrences.
 * Test with: nums = {5, 2, 8, 2, 1, 9, 1, 1} → expected output: smallest = 1,
 * first index = 4, count = 3.
 * Bonus challenge: solve it in a single pass (one loop only) instead of two —
 * think about how you'd track the count as you go, especially what happens when
 * you find a new smallest value partway through.
 */