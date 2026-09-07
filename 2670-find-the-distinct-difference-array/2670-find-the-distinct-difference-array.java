class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i<n;i++){
            int leftcount = 0;
            for(int j = 0; j<=i;j++){
                boolean isunique = true;
                for(int k = 0; k < j; k++){
                    if(nums[j] == nums[k]){
                        isunique = false;
                        break;
                    }
                }
                if (isunique) leftcount++;
            }
            int rightcount = 0;
            for(int j = i + 1; j < n;j++){
                boolean isunique = true;
                for(int k = i + 1; k<j;k++){
                    if(nums[j] == nums[k]){
                        isunique = false;
                        break;
                    }
                }
                if (isunique) rightcount++;
            }
            ans[i] = leftcount - rightcount;
        }
        return ans;
    }
}