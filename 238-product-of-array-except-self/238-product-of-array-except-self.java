class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] op = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            op[i] = 1;
        }
        
        int prefix = 1;
        
        for(int i=0;i<nums.length;i++){
           op[i] = prefix;
           prefix = prefix * nums[i];
        }
        
        
        int postfix = 1;

        for(int i=nums.length-1;i>=0;i--){
            op[i] = op[i] * postfix;
            postfix = postfix * nums[i];
        }
        System.out.println();
         
        
       
    return op;

    }
    
    }