import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
   static boolean  checkDuplicate(int num[]){
    Set<Integer> seen = new HashSet<>();
for(int i=0;i<num.length;i++){
if(seen.contains(num[i])){
    return true;
}
seen.add(num[i]);
}
return false;
    }

    public static void main(String args[]){
int [] num={1,2,3};
System.out.println(checkDuplicate(num));
}
}
