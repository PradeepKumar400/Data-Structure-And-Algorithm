class SumofArray{
    public static void main(String[] args){
        int [] num={1,2,3,4,5};
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println("The sum of array is :" + sum);
    }
}

/* Requirements:

1.Store your numbers in an array, e.g. int[] nums = {1, 2, 3, 4, 5};
2.Create a variable sum, initialized to 0.
3.Use a for loop to go through each element of the array.
4.On each iteration, add the current element to sum.
5.After the loop finishes, print sum.
Test with: nums = {1, 2, 3, 4, 5} → expected output 15. */