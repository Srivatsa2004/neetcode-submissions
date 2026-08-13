class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String str = new StringBuilder(clean).reverse().toString();
        
        if(clean.equals(str)){
            return true;
        }
        return false;
    }
}
