class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(s1).reverse().toString();

        if(s1.equals(reversed)){
            return true;
        }
        return false;
    }
}
