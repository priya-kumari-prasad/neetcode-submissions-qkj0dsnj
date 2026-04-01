class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }
        
        int majority1 = 0;
        int majority2 = 0;

        int count1 = 0;
        int count2 = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i] == majority1){
                count1++;
            }
            else if(nums[i] == majority2){
                count2++;
            }
            else if(count1 == 0){
                majority1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                majority2 = nums[i];
                count2 = 1;
            }            
            else{
                count1--;
                count2--;
            }
            i++;
        }
        count1 = 0;
        count2 = 0;
        for(int j = 0; j<nums.length;j++){
            if(nums[j] == majority1){
                count1++;
            }
            else if(nums[j] == majority2){
                count2++;
            }
        }
        if(count1 > nums.length/3){
            res.add(majority1);
        }
        if(count2 > nums.length/3){
            res.add(majority2);
        }
        return res;
    }
}