public class CheckStringRotation {
    static boolean findCheckStringRotationAnother(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String doubled=s1+s1;
        if(doubled.contains(s2)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String s1="waterbottle";
        String s2="erbottlewat";
        boolean res =findCheckStringRotationAnother(s1,s2);
        System.out.println(res);
    }
    
}
