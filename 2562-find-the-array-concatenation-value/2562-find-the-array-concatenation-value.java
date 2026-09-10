class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        long sum = 0;

        while (i <= j) {
            if (i == j) {
                sum += nums[i];
            } else {
                String s = nums[i] + "" + nums[j];
                sum += Long.parseLong(s);
            }
            i++;
            j--;
        }

        return sum;
    }
}