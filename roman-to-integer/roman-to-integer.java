class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int val_int = hm.get(s.charAt(s.length()-1));
        int i = s.length() - 2;
        while(i>=0){
            if(hm.get(s.charAt(i)) >= hm.get(s.charAt(i+1)))
            {
                val_int = val_int + hm.get(s.charAt(i));
            }
            else{
                val_int = val_int - hm.get(s.charAt(i));
            }
            i--;
        }
        System.out.println(val_int);
        return val_int;
    }
}