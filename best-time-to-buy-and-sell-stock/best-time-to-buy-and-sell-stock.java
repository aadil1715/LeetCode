class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 0;
        int max = 0;
        int diff = 0;
        while(j<prices.length){
            if(prices[j]>prices[i]){
                max = Math.max(prices[j] - prices[i],max);
                j++;
            }
            else{
                i=j;
                j++;
            }
        }
        return max;
    }
}