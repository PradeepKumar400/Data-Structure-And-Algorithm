public class EquilibriumIndex {
    static int FindEquilibriumIndex(int nums[]){
        int leftsum=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
           totalsum= totalsum+nums[i];
        }
        //System.out.println(totalsum);
        for(int i=0;i<nums.length;i++){
            int rigthsum=totalsum-leftsum-nums[i];
            if(leftsum==rigthsum){
                
                return i;
            }
            else{
                leftsum=leftsum +nums[i];
            }
           
        } 
 return -1;
        
    }
    public static void main(String args[]){
        int nums[]={2, 1, -1};
        int res=FindEquilibriumIndex(nums);
        System.out.println("Equilibrium Index is :"+res);
    }
    
}

/* 
Requirements:

Store your numbers in an array, e.g. int[] nums = {1, 7, 3, 6, 5, 6};
Calculate totalSum by adding all elements using a for loop.
Create a variable leftSum, initialized to 0.
Use a for loop from i = 0 to nums.length - 1.
On each iteration, calculate rightSum = totalSum - leftSum - nums[i];
If leftSum == rightSum, print i and stop (use break or return), since you want the first such index.
If not equal, update leftSum = leftSum + nums[i]; and move on. (Update it after the check, because nums[i] must not count in its own left side.)
If the loop finishes with no match, print -1.
Test with: nums = {1, 7, 3, 6, 5, 6} → expected output 3.
Test with: nums = {1, 2, 3} → expected output -1.
Test with: nums = {2, 1, -1} → expected output 0 (left side is empty, so leftSum = 0, and right = 1 + (-1) = 0).
Test with a single element: nums = {5} → expected output 0 (both sides are empty, so both sums are 0).
Think about: why do we update leftSum after the comparison and not before? Trace {1, 7, 3, 6, 5, 6} by hand and write down leftSum and rightSum at every index.
Constraint: don’t use two nested loops to recompute left and right sums for each index (O(n²)). Solve it with one pass to get the total, plus one pass to find the index.

Pattern: This is the Prefix Sum pattern */
