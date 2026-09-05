class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) 
            continue;

            int slow = i;
            int fast = i;

            boolean forward = nums[i] > 0;

            while (true) {
                slow = nextIndex(nums, forward, slow);
                fast = nextIndex(nums, forward, fast);

                if (fast != -1)
                    fast = nextIndex(nums, forward, fast);

                if (slow == -1 || fast == -1 || slow == fast)
                    break;
            }

            if (slow != -1 && slow == fast)
                return true;
            int idx = i;
            int sign = nums[i];
            while (nums[idx] * sign > 0) {
                int next = ((idx + nums[idx]) % n + n) % n;
                nums[idx] = 0;
                idx = next;
            }
        }
        return false;
    }

    private int nextIndex(int[] nums, boolean forward, int i) {
        boolean direction = nums[i] > 0;
        if (direction != forward)
         return -1;

        int n = nums.length;
        int next = ((i + nums[i]) % n + n) % n;

        if (next == i)
         return -1;

        return next;
    }
}