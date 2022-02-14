class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0;
        int res=Integer.MIN_VALUE;
        int j=0;
        while(j<nums.length){
            sum = sum + nums[j];
            
            res = Math.max(res,sum);
            if(sum<0){
                sum = 0;
            }
            j=j+1;
        }
        
        return res;
    }
}