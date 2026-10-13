class LargestNumber{
    public static void main(String []args){
        int num []={3,7,2,9,4};
        int max=3;
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
            max=num[i];
            }
        }
        System.out.println("The largest number in array is :"+max);
    }
}

/* Requirements:

1.Store your numbers in an array, e.g. int[] nums = {3, 7, 2, 9, 4};
2.Create a variable max, initialized to the first element of the array (nums[0]).
3.Use a for loop to go through the remaining elements (starting from index 1).
4.On each iteration, compare the current element with max — if the current element is bigger, update max to that value.
5.After the loop finishes, print max.
Test with: nums = {3, 7, 2, 9, 4} → expected output 9. */