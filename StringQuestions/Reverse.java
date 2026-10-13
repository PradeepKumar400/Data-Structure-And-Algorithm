public class Reverse {
    static char[] findReverseString(String s){
        
        int left=0;
        int right=s.length()-1;

        char[] chars = s.toCharArray();
        if (s.isEmpty()) {
            System.out.println("String is Empty");;
        }
        while(left<right){
            char temp = chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        
        return chars;
        
        

    }
    public static void main(String[] args){
        String s="";
        char[] res=findReverseString(s);
        
            System.out.println(new String(res));
        
    }
    
}
