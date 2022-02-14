class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for (int n : nums1){
            set.add(n);
        }
        
        for (int n : nums2){
            if(set.contains(n)){
                intersection.add(n);
            }
        }
        
        int op[] = new int[intersection.size()];
        int j = 0;
        for (Integer i : intersection){
            op[j++] = i;
        }
        
        return op;
    }
}