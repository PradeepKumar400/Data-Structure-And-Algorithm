
public class RotateArrayKthPoaition {
    public static void reverse(int num[], int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        
    }

    public static int[] rotate(int num[], int k) {
        k = k % num.length;
        reverse(num, 0, num.length - 1);
        reverse(num, 0, k - 1);
        reverse(num, k, num.length - 1);

        return num;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4 };
        int k = 3;
        int res[] = rotate(num, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

}