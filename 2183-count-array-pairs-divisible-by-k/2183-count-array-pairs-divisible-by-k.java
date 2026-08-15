class Solution {
    public long countPairs(int[] nums, int k) {
        long count = 0;
        long[] freq = new long[k + 1];
        for (int i = 0; i < nums.length; i++) {
            int x = gcd(nums[i], k);
            int c = k / x;
            for (int j = 1; j * j <= k; j++) {
                if (k % j == 0) {
                    int nums1 = k / j;
                    if ((long) x * j % k == 0) {
                        count += freq[j];
                    }
                    if (nums1 != j && (long) x * nums1 % k == 0) {
                        count += freq[nums1];
                    }
                }
            }
            freq[x]++;
        }
        return count;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}