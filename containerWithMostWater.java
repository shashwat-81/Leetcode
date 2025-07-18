public class containerWithMostWater {
    public int maxArea(int[] height) {
        int left=0;
        int total=0;
        int right=height.length-1;
        int minHeight=0;
        while(left<right){
            
            if(height[left]<height[right]){
                minHeight=height[left++];
            }
            else minHeight=height[right--];
            total=Math.max(total,minHeight*(right-left+1));

        }
        return total;
    }
}
