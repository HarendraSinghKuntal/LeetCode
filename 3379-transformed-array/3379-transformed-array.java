class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i<nums.length;i++){
            int move = nums[i];
            int newIndex = (i + move) % n;
            if(newIndex < 0){
                newIndex += n;
            }
            res[i] = nums[newIndex];
        }
        return res;
    }
}