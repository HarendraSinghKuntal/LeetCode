class Solution {

    int[] bit;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        bit = new int[n + 2];

        List<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {

            int rank = getRank(sorted, nums[i]);

            result.add(query(rank - 1));

            update(rank, 1);
        }

        Collections.reverse(result);

        return result;
    }

    private int getRank(int[] sorted, int val) {
        return Arrays.binarySearch(sorted, val) + 1;
    }

    private void update(int i, int val) {
        while (i < bit.length) {
            bit[i] += val;
            i += i & -i;
        }
    }

    private int query(int i) {
        int sum = 0;
        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }
}