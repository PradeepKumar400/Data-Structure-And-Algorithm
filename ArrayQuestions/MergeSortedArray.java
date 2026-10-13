public class MergeSortedArray {
    static int[] mergearray(int arr1[], int arr2[]) {
        int res[] =new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j< arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k]=arr2[j] ;
                j++;
            }
            k++;
 
        }
        while(i<arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        int [] res =mergearray(arr1, arr2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
    }

}

/* 
Requirements:

Store two sorted arrays, e.g. int[] a = {1, 3, 5, 7}; and int[] b = {2, 4, 6, 8, 10};
Create a result array int[] result = new int[a.length + b.length];
Create three pointers, all starting at 0: i (for array a), j (for array b), and k (for result).
Use a while loop that runs as long as i < a.length and j < b.length:
If a[i] <= b[j]: copy a[i] into result[k], then do i++.
Otherwise: copy b[j] into result[k], then do j++.
In both cases, do k++ after copying.
After that loop ends, one array may still have leftover elements. Use a second while loop to copy the remaining elements of a (while i < a.length).
Use a third while loop to copy the remaining elements of b (while j < b.length).
Print the result array.
Test with: a = {1, 3, 5, 7}, b = {2, 4, 6, 8, 10} → expected output {1, 2, 3, 4, 5, 6, 7, 8, 10}.
Test with duplicates: a = {1, 2, 2}, b = {2, 3} → expected output {1, 2, 2, 2, 3}.
Test the edge case where one array is empty, e.g. a = {}, b = {4, 5} → expected output {4, 5}.
Think about: why is it enough to compare only the current front element of each array, instead of comparing every element of a with every element of b?
Constraint: don't merge first and then call Arrays.sort(). Use the sorted property of the inputs.

Pattern: This is the Two-Pointer (Merge) pattern. One pointer walks each sorted array, and you always take the smaller front element. It is the same "merge" step used in Merge Sort.

Time Complexity: O(n + m), where n and m are the lengths of the two arrays, since every element is copied exactly once. Space Complexity: O(n + m) for the new result array. (If you only count extra working space beyond the output, it is O(1).)
 */