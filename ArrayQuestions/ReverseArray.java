public class ReverseArray {
    static int[] ReverseArr(int num []){
    int left=0;
    int right=num.length-1;
    while (left<right) {
        int temp=num[left];
        num[left]=num[right];
        num[right]=temp;
        left++;
        right--;
    }
   return num;
    }
     
    public static void main(String args[]){
        int num []={1, 2, 3, 4, 5};
        int [] res=ReverseArr(num);
        for(int i=0;i<res.length;i++){
           System.out.print(res[i] +" "); 
        } 
        
    }
}
