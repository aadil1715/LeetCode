class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> li = new ArrayList<Integer>();
        
        if(n<m){
            int[] temp = nums2;
            Arrays.sort(temp);
            for(int i=0;i<n;i++){
                if(binary_search(nums1[i],temp)){
                    if(!li.contains(nums1[i])){
                    li.add(nums1[i]);
                    }
                }
            }
        }
        else{
            int[] temp = nums1;
            Arrays.sort(temp);
            for(int i=0;i<m;i++){
                if(binary_search(nums2[i],temp)){
                    if(!li.contains(nums2[i])){
                    li.add(nums2[i]);
                    }
                }
            }
        }
        
        System.out.println(li);
        int op[] = new int[li.size()];
        for(int i=0;i<li.size();i++){
            op[i] = li.get(i);
        }
        
        return op;
    }
    
    public boolean binary_search(int n,int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==n){
                return true;
            }
            else if(n<nums[mid]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}