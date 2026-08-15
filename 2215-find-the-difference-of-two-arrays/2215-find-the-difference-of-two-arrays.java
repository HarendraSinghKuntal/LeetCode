class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = createSet(nums1);
        Set<Integer> set2 = createSet(nums2);
        return Arrays.asList(getMissing(set1, set2), getMissing(set2, set1));
    }

    private Set<Integer> createSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int x : array) {
            set.add(x);
        }
        return set;
    }

    private List<Integer> getMissing(Set<Integer> first, Set<Integer> second) {
        List<Integer> list = new ArrayList<>();
        for (int x : first) {
            if (!second.contains(x)) {
                list.add(x);
            }
        }
        return list;
    }
}