public class Majority {
    static int findmajority(int num[]) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (count == 0) {
                candidate = num[i];
            }
            if(candidate ==num[i]){
                count++;
            }
            else
                count--;
        }
         // Verify candidate
        int occurrence = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == candidate) {
                occurrence++;
            }
        }

        if (occurrence > num.length / 2) {
            return candidate;
        }
return candidate;

    }

    public static void main(String args[]) {
        int num[] = { 3,3,1,1,1,1,1,1};
        int res=findmajority(num);
        System.out.println(res);
    }
}


/* Requirements:

Store your numbers in an array, e.g. int[] nums = {2, 2, 1, 1, 1, 2, 2};
Create two variables: candidate, initialized to 0 (or any dummy value), and count, initialized to 0.
Use a for loop to traverse the array from index 0.
On each iteration:
If count == 0, set candidate = nums[i]; (pick a fresh candidate to "fight for").
Then, if nums[i] == candidate, increment count; otherwise, decrement count.
After the loop finishes, candidate holds the majority element — print it.
Test with: nums = {2, 2, 1, 1, 1, 2, 2} → expected output 2.
Test with: nums = {3, 3, 4, 2, 4, 4, 2, 4, 4} → expected output 4.
Optional verification step: since this algorithm assumes a majority element exists, add a second pass that counts candidate's actual occurrences and confirms it's truly greater than nums.length / 2 — useful if you're not 100% sure the guarantee holds.
Think about: why does "canceling out" a non-matching element with a matching one still leave the true majority element standing at the end? Trace through {2, 2, 1, 1, 1, 2, 2} by hand, tracking candidate and count after every step.


Pattern: This is the Boyer-Moore Voting Algorithm */