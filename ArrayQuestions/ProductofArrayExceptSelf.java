public class ProductofArrayExceptSelf {
    public static void main(String args[]) {

        int[] nums = { 1, 2, 3, 4 };
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        // Step 1: build prefix array
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Step 2: build suffix array
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Step 3: combine prefix and suffix
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}



```
/* Requirements:

Store your numbers in an array, e.g. int[] nums = {1, 2, 3, 4};
Create a result array int[] result of the same length as nums.
Create a prefix array where prefix[i] = product of all elements before index i (prefix[0] = 1, since nothing is before index 0).
Fill prefix left-to-right: prefix[i] = prefix[i-1] * nums[i-1];
Create a suffix array where suffix[i] = product of all elements after index i (suffix[last] = 1, since nothing is after the last index).
Fill suffix right-to-left: suffix[i] = suffix[i+1] * nums[i+1];
Build the final answer: result[i] = prefix[i] * suffix[i] for every index.
Print the result array.
Test with: nums = {1, 2, 3, 4} → expected output {24, 12, 8, 6}.
Constraint: no division allowed (division breaks if any element is 0). */