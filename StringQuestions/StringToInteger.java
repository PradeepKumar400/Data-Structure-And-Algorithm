public class StringToInteger {
    static long findStringToInteger(String str) {
        int i = 0;
        int sign = 1;
        long result = 0;

        // 1. Skip leading spaces
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        // 2. Read sign
        if (i < str.length() && str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else {
            i++;
        }
        // 3. Read digits
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int digit = str.charAt(i) - '0';
            result = result * 10 + digit;

            // 4. Check overflow
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String args[]) {
        String str = "";
        long res = findStringToInteger(str);
        System.out.println(res);
    }

}
