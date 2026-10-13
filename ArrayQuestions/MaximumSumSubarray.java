class MaximumSumSubarray {
    static void findsubarray(int[] num) {
        int currentsum = num[0];
        int maxsum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (currentsum + num[i] > num[i]) {
                currentsum += num[i];
            } else {
                currentsum = num[i];
            }
            if (currentsum > maxsum) {
                maxsum = currentsum; 
            }
        }
        System.out.println("Max Subarray Sum = " + maxsum);
    }

    public static void main(String[] args) {
        int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        findsubarray(num);
    }

}