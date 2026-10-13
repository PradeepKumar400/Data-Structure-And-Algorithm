public class Palindrome {
    static boolean findPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;

            }
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = findPalindrome(s);
        System.out.println(res);
    }

}
