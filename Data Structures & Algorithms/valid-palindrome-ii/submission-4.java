class Solution {
    public boolean validPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        if(s.length() == 1){
            return true;
        }

        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s.substring(0, left)+s.substring(left+1))
                || isPalindrome(s.substring(0, right) + s.substring(right+1)) ;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}