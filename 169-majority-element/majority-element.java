class Solution {
    public int majorityElement(int[] nums) {
        // int count =0;
        // int maxCount = 0;
        // int num = 0;
        // int n = nums.length;
        // if(n==1){
        //     return nums[0];
        // }
        // for(int i=0; i<n-1;i++){
        //     count=0;
        //     for(int j=0; j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>maxCount){
        //         maxCount=count;
        //         num=nums[i];
        //     }
        // }
        // return num;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
           
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        
        }
        return -1;
    }
}