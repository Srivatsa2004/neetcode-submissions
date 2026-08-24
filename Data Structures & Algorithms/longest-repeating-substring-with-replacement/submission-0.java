class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int res =0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq,map.get(c));
            while((i - left + 1) - maxFreq > k){
                char left_c = s.charAt(left);
                map.put(left_c, map.get(left_c)-1);
                left++;
            }
            res = Math.max(res , i-left +1);
        }
        return res;
    }
}
