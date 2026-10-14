public class CountVowels {
    static int findvowelsCount(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char c=Character.toLowerCase(str.charAt(i));
          if(c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u' ){
            count++;
          }
          
        }
        return count;
    }
    public static void main(String args[]){
        String s1="Pradeepkumar";
        int res=findvowelsCount(s1);
        System.out.println(res);
    }
    
}
