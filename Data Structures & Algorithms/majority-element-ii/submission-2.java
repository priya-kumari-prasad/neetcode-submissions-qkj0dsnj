class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int majority1 = 0;
        int majority2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int num: nums){            
            if(num == majority1){
                count1++;
            }
            else if(num == majority2){
                count2++;
            }
            else if(count1 == 0){
                majority1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                majority2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == majority1){
                count1++;
            }
            else if(nums[i] == majority2){
                count2++;
            }
        }

        List<Integer> res = new ArrayList<>();

        if(count1 > n/3){
            res.add(majority1);
        }
        if(count2 > n/3){
            res.add(majority2);
        }
        return res;
    }
}