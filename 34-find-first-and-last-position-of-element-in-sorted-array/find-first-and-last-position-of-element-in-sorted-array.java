class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                result.add(i);
            }
        }
        int m = result.size();
        if (m == 0) {
            return new int[]{-1, -1};
        }else{
            return new int[]{result.get(0), result.get(m-1)};
        }
    }
}