class Solution {
    public int maximumGap(String skill, String station) {
        int m = skill.length();
        int n = station.length();
        int[] L = new int[m];
        int[] R = new int[m];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (station.charAt(i) == skill.charAt(j)) {
                L[j] = i;
                j++;
                if (j == m)
                    break;
            }
        }
        j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (station.charAt(i) == skill.charAt(j)) {
                R[j] = i;
                j--;
                if (j < 0)
                    break;
            }
        }
        int ans = 0;
        for (int i = 0; i < m - 1; i++) {
            ans = Math.max(ans, R[i + 1] - L[i]);
        }

        return ans;
    }
}