class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs.length == 0) return "";
        String common_prefix2 = strs[0];
        int i = 1;
        while(i<strs.length){
            System.out.println(common_prefix2 + "  " + strs[i] + " " + strs[i].indexOf(common_prefix2));
            while(strs[i].indexOf(common_prefix2)!=0){
                common_prefix2 = common_prefix2.substring(0,common_prefix2.length()-1);
                if(common_prefix2.isEmpty())  return "";
            }
            i++;
        }
      
        return common_prefix2;
    }
}