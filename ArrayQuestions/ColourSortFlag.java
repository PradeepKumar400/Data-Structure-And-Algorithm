public class ColourSortFlag {
  static int[] coloursort(int num[]){
    int low=0;
    int mid=0;
    int high=num.length-1;

    while(mid <=high){
        if(num[mid]==0){
        int temp=num[low];
        num[low]=num[mid];
        num[mid]=temp;
        low++;
        mid++;
        }
        else if(num[mid]==1){
            mid++;
        }
        else{
            int temp=num[mid];
            num[mid]=num[high];
            num[high]=temp;
            high--;
        }
       

    } 
    return num;
  }
    
    public static void main(String args[]){
        int num []={2, 0, 2, 1, 1, 0};
       coloursort(num);
       System.out.print("{");
       for(int i=0;i<num.length;i++){
        System.out.print(num[i]);
        if(i<num.length-1){
            System.out.print(",");
        }
       }
       System.out.print("}");

    }
}


/* Requirements:

Store your numbers in an array, e.g. int[] nums = {2, 0, 2, 1, 1, 0};
Create three pointers: low = 0, mid = 0, and high = nums.length - 1.
Use a while loop that runs as long as mid <= high.
On each iteration, check nums[mid]:
If it is 0: swap nums[low] and nums[mid], then do low++ and mid++.
If it is 1: it's already in the right zone, so just do mid++.
If it is 2: swap nums[mid] and nums[high], then do high-- only (do not move mid).
After the loop finishes, print the array.
Test with: nums = {2, 0, 2, 1, 1, 0} → expected output {0, 0, 1, 1, 2, 2}.
Test with: nums = {2, 0, 1} → expected output {0, 1, 2}.
Test the edge case of an array with all the same value, e.g. {1, 1, 1} → should stay unchanged.
Think about: why do we move mid forward after swapping with low, but not after swapping with high? (Hint: what value did you just bring in from the high end, and has it been checked yet?)
Constraint: don't use Arrays.sort() or count the 0s, 1s, and 2s in a first pass. Solve it in a single pass.

Pattern: This is the Three-Pointer (Dutch National Flag) pattern. The array is split into four zones: [0 .. low-1] all 0s, [low .. mid-1] all 1s, [mid .. high] unknown, and [high+1 .. end] all 2s. The unknown zone shrinks each step until it disappears.

Time Complexity: O(n). Each iteration either advances mid or shrinks high, so every element is handled at most once. Space Complexity: O(1). Only three pointer variables and a temp for swapping are used. */