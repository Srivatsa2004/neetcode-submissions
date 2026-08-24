class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 > len2)
            return false;

        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for(char c : s1.toCharArray()){
            c1[c - 'a']++;
        }
        int window = len1;
        for(int i =0;i<len1; i++){
            c2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(c1, c2)){
            return true;
        }
        for(int i = window; i < len2;i++){
            c2[s2.charAt(i) - 'a']++;

            int left = i - window;
            c2[s2.charAt(left) - 'a']--;
            if(Arrays.equals(c1,c2)){
                return true;
            }
        }
        return false;
    }
}
