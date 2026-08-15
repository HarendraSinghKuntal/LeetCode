class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
            int n = nums[i];
            int reverse = 0;
            while(n!=0){
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n/10;
            }
            set.add(reverse);
        }
        return set.size();
    }
}