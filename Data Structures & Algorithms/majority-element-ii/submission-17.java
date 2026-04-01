class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int num1 = -1; int num2 = -1;
         int count1 = 0; int count2 = 0;

         for(int n: nums){
            if(n == num1){
                count1++;
            }
            else if(n == num2){
                count2++;
            }
            else if(count1 == 0){
                num1 = n;
                count1 = 1;
            }
            else if(count2 == 0){
                num2 = n;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
         }
         count1 = count2 = 0;
         for(int num: nums){
            if(num == num1){
                count1++;
            }
            else if(num == num2){
                count2++;
            }
         }
         List<Integer> res = new ArrayList<>();
         if(count1 > nums.length/3){
            res.add(num1);
         }
         if(count2 > nums.length/3){
            res.add(num2);
         }
         return res;
    }
}