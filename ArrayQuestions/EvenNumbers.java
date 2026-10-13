public class EvenNumbers {
    public static void main(String[] args) {
        int[] num = { 4, 7, 10, 3, 8, 16, 6 };
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;
                System.out.print(num[i] + ", ");

            }
        }
        System.out.println();
        System.out.println("the even count =" + count);
    }
}

/*
 * Requirements:
 * 
 * 1.Store your numbers in an array, e.g. int[] nums = {4, 7, 10, 3, 8, 15, 6};
 * 2.Create a variable count, initialized to 0.
 * 3.Use a for loop to go through each element of the array.
 * 4.On each iteration, check if the current element is even using nums[i] % 2 ==
 * 0.
 * 5.If it's even, increment count by 1.
 * After the loop finishes, print count.
 * Test with: nums = {4, 7, 10, 3, 8, 15, 6} → expected output 4.
 */