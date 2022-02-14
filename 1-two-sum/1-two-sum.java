class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i=0;
        while(i<nums.length){
            if(hm.containsKey(target-nums[i])){
                return new int[]{i,hm.get(target-nums[i])};
            }
            hm.put(nums[i],i);
            i++;
        }
        return new int[]{0,0};
    }
}