class CheckArraySort{
     boolean checkarray(int num[]){
        boolean issorted = true;
        for(int i=0;i<num.length-1; i++){
            if(num[i]>num[i+1]){
                return false;
            }
            
        }
        return issorted;
     }
    public static void main(String[]args){
    int num[]={1,4,3,4,5,6,7};
    CheckArraySort obj=new CheckArraySort();
    System.out.println(obj.checkarray(num));
    }
}

/* 
Requirements:

Store your numbers in an array, e.g. int[] nums = {1, 2, 2, 4, 5};
Create a boolean variable isSorted, initialized to true.
Use a for loop to traverse the array from index 0 up to the second-to-last element (i < nums.length - 1).
On each iteration, compare the current element with the next one: if nums[i] > nums[i + 1], the array is not sorted — set isSorted = false; and break out of the loop immediately (no need to check further).
After the loop finishes, print isSorted.
Test with: nums = {1, 2, 2, 4, 5} → expected output true (equal adjacent elements are still considered sorted).
Test with: nums = {1, 5, 3, 4, 2} → expected output false.
Test the edge case of an array with only one element or an empty array → both should be considered trivially sorted (true), since there's nothing to compare — confirm your loop handles this automatically (it should never even enter the loop body in these cases).
Think about: why checking only nums[i] > nums[i+1] for every adjacent pair is enough to guarantee the whole array is sorted — you don't need to compare every pair with every other pair. */