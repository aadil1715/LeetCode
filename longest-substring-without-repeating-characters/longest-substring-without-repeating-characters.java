class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hm = new HashSet<>();
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        
        while(b_pointer<s.length()){
            if(!hm.contains(s.charAt(b_pointer)))
            {
                hm.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hm.size(),max);
            }
            else{
                hm.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        
        return max;
    }
}