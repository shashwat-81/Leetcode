class TrappingWater {
    public int trap(int[] height) {
        int[] prefixMax=new int[height.length];
        int[] suffixMax=new int[height.length];
        int  trappedWater=0;
        //calculation of prefix max

        prefixMax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
        }

        //calculation of suffix max
         suffixMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
             suffixMax[i]=Math.max(suffixMax[i+1],height[i]);
        }

        for(int i=0;i<height.length-1;i++)
        {
            trappedWater+=Math.min(prefixMax[i],suffixMax[i])-height[i];

        }
        return trappedWater;

        
    }
}

