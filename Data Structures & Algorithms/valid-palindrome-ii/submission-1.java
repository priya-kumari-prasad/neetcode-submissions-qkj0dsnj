class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s.substring(0, left)+s.substring(left+1)) || 
                isPalindrome(s.substring(0, right)+s.substring(right+1, s.length()));
            }
            left++;
            right--;
        }

        return false;

    }
    public boolean isPalindrome(String s){
        int st = 0; int end = s.length()-1;
        while(st < end){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}