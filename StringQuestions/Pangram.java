public class Pangram {
    static boolean findPandgram(String str){
        boolean[] seen =new boolean[26];
       for(int i=0;i<str.length();i++){
        char c= Character.toLowerCase(str.charAt(i));
        if(c >= 'a' && c<= 'z'){
            seen[c -'a'] = true;
        }
       }

       for(int i=0;i<26;i++){
        if(!seen[i]){
            return false;
        }
       
       } 
       return true;
    }
    public static void main(String args[]){
        String str="oewqasdfghjkzx";
        boolean res =findPandgram(str);
        System.out.println(res);
    }
    
}
