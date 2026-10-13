import java.util.Scanner;

class ArrayInitialize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Method 1 — Directly provide values
        int[] arr = { 10, 20, 30, 40, 50 };
        // Method 2 — Create an empty array with a size
        int[] arr2 = new int[4];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;

        //// input from user
        int[] arr3 = new int[2];

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("enter the number" + (i + 1) + ":");
            arr3[i] = scanner.nextInt();
        }

        for (int arrays : arr) {
            System.out.println(arrays);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}