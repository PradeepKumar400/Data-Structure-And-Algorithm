public class FirstnonRepeatingChar {
    static void findFirstChar(String str){
        int [] count=new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)- 'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)-'a'] ==1){
                System.out.println(i);
                return;
            }
            
        }
        System.out.println(-1);
    }
    public static void main(String args[]){
        String str="aabb";
        findFirstChar(str);
    }
    
}
