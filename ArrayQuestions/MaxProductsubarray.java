class MaxProductsubarray {
    static int findmaxproduct(int num[]){
int min=num[0];
int max=num[0];
int res=num[0];
for(int i=1;i<num.length;i++){
    if(num[i]<0){
        int temp=max;
        max=min;
        min= temp;
    }
    if(num[i]>max*num[i]){
        max=num[i];
    }
    else{
        max=max*num[i];
    }
    if(num[i]< min*num[i]){
        min=num[i];
    }
    else{
        min=num[i]*min;
    }
    if(max>res){
        res=max;
    }
}
return res;
    }

    public static void main(String args[]) {
        int nums[] = { 2,-3,-2, 4 };
        int res =findmaxproduct(nums);
        System.out.println("Max Product Subarray :"+res);

    }
}