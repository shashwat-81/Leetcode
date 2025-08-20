class singleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int res=0;int i=0;
        int count =1;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1])
            i=i+2;
            else{
                res=nums[i];
                break;

            }
            if(i==nums.length-1)
            return nums[i];
            

        }
        return res;
    
    }
}