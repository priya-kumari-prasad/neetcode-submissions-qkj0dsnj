class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> key = new HashMap<>();
        int n = numbers.length;
        // for(int i = 0; i<n; i++){
        //     key.put(numbers[i], i);
        // }
        int[] res = new int[2];    
        for(int i = 0; i<n; i++){
            int diff = target - numbers[i];
            if(key.containsKey(diff)){
                res[0] = Math.min(i+1, key.get(diff)+1);
                res[1] = Math.max(i+1, key.get(diff)+1);
                break;
            }
            key.put(numbers[i], i);
        }
        return res;
    }
}
