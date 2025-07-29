class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int res=1;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            res*=nums[i];
            else 
            zeroCount++;
        }
        int[] finalRes=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeroCount>1)
            finalRes[i]=0;
            else if(zeroCount==1)
            finalRes[i]=(nums[i]==0)?res:0;
            else
            finalRes[i]=res/nums[i];
        }
        return finalRes;
    }
}