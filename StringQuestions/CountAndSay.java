public class CountAndSay {
    static String FindCountAndSay(int num) {
        String current = "1";
        for (int i = 2; i < num; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            for (int j = 1; j < current.length(); j++) {
                if (current.charAt(j) == current.charAt(j - 1)) {
                    count++;
                } else {
                    next.append(count);
                    next.append(current.charAt(j-1));
                    count = 1;
                }
           
            }
            next.append(count);
           next.append(current.charAt(current.length()-1));
           current=next.toString();

        }
        return current;
    }

    public static void main(String args[]) {
        int num = 5;
       String res= FindCountAndSay(num);
       System.out.println(res);

    }

}
