class Solution {
    public int maxProfit(int[] prices) {
        int left_pointer = 0;
        int right_pointer = 0;
        int res = 0;
        while(right_pointer<prices.length){
            if(prices[right_pointer]>prices[left_pointer]){
                res = Math.max(prices[right_pointer]-prices[left_pointer],res);
                right_pointer=right_pointer+1;
            }
            else{
                left_pointer=right_pointer;
                right_pointer=right_pointer+1;
            }
            
        }
        
        return res;
    }
}