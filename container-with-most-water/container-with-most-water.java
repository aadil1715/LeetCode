class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int areac = 1;
        int area = 0;
        if(height.length == 2){
            return height[0]>height[1] ? height[1] : height[0];
        }
        while(l<r){
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