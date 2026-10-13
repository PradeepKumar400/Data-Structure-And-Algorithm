public class ContainerMostWater {
    static int findMaxwaterStore(int heights[]){
        int left=0;
        int right=heights.length-1;
        int maxwater=0;
        while(left<right){
            int width=right-left;
            int minheight;
            if(heights[left] < heights[right]){
             minheight=heights[left];
            }
            else{
                minheight=heights[right];
            }
            int water=width*minheight;
            if(water>maxwater){
               maxwater=water;
            }
            if(heights[left]<heights[right]){
                 left++;
            }
            else{
            right--;
        }
    }
    return maxwater;
    }
    public static void main(String args[]){
        int heights[]={1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxwater= findMaxwaterStore(heights);
        System.out.println(maxwater);
    }
}
