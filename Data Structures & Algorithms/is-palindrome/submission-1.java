class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();

        for(char c: s.toCharArray()){
           if(Character.isLetterOrDigit(c)){
            rev.append(Character.toLowerCase(c));
           }
        }
        
        return rev.toString().equals(rev.reverse().toString());
    }
}
