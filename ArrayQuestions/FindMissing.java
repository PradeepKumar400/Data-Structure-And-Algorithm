class FindMissing {
    static void missing(int num[]) {
        int l = num.length+1;
        int expectsum = l * (l + 1) / 2;
        int actualsum = 0;
        for (int i = 0; i < num.length; i++) {
            actualsum = actualsum + num[i];


        }
        int missingnumber =expectsum - actualsum;
        System.out.println("the missing number is :" + missingnumber);
    }

    public static void main(String args[]) {
        int num[] = { 1, 3, 4};
        missing(num);
    }
}