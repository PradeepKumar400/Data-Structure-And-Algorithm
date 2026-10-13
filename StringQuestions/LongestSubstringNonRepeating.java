import java.util.HashSet;

public class LongestSubstringNonRepeating {
    static int findSubStringChar(String str){
        int left=0;
        int maxlen=0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<str.length();right++){
          while(set.contains(str.charAt(right))){
            set.remove(str.charAt(left));
            left++;
          }
         set.add(str.charAt(right));
         int len=right-left+1;
         if(len>maxlen){
            maxlen=len;
         }
         
        }
        return maxlen;
    }
    public static void main(String []args){
        String str="abcabcbb";
        int res=findSubStringChar(str);
        System.out.println(res);
    }
    
}
