class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int areac = 1;
        int area = 0;
        while(l<r){
            // Breadth = r - l;
            // Height = Math.min(height[r],height[l]);
            areac = (r-l) * Math.min(height[r],height[l]);
            area = Math.max(area,areac);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
        
    }
}
