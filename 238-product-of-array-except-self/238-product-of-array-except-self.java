class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output_arr = new int[nums.length];
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            output_arr[i] = 1;
        }
        
        int prefix=1;
        for(int i=0;i<n;i++){
            output_arr[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postfix=1;
        for(int i=n-1;i>=0;i--){
            output_arr[i] = output_arr[i]*postfix;
            postfix = postfix * nums[i];
        }
    
        return output_arr;
    
    }
    
    }