import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayLeaders{
    static List<Integer> findArrayLeaders(int nums[]){
       int max=Integer.MIN_VALUE;
      List<Integer> leader= new ArrayList<>();
      for(int i=nums.length-1;i>=0;i--){
        if(nums[i]>max){
            leader.add(nums[i]);
            max=nums[i];
        }
        
      }
      Collections.reverse(leader);
      return leader;
      
    }
    public static void main(String[] args) {
         int nums[]={4, 3, 2, 1};
        List<Integer> leaders =findArrayLeaders(nums);
        System.out.println(leaders);

    }
}


/* 
Requirements:

Store your numbers in an array, e.g. int[] nums = {16, 17, 4, 3, 5, 2};
Create a variable maxFromRight, initialized to Integer.MIN_VALUE.
Create a List<Integer> leaders = new ArrayList<>(); to store the leaders.
Use a for loop that goes backwards, from i = nums.length - 1 down to 0.
On each iteration, check if nums[i] > maxFromRight:
If yes: add nums[i] to leaders, then update maxFromRight = nums[i].
The leaders are collected in reverse order (right to left). Reverse the list using Collections.reverse(leaders); so they print in the original left-to-right order.
Print leaders.
Test with: nums = {16, 17, 4, 3, 5, 2} → expected output [17, 5, 2].
Test with: nums = {1, 2, 3, 4} → expected output [4] (only the last element).
Test with: nums = {4, 3, 2, 1} → expected output [4, 3, 2, 1] (every element is a leader).
Test with duplicates: nums = {7, 7, 7} → expected output [7] (an element must be strictly greater, so only the last one counts).
Think about: why do we start from the right side instead of the left? What does maxFromRight represent after each step?
Constraint: don’t use a nested loop that checks every element against everything on its right (O(n²)). Solve it in a single backward pass.


Pattern: This is the Right-to-Left Traversal with Running Maximum pattern. */