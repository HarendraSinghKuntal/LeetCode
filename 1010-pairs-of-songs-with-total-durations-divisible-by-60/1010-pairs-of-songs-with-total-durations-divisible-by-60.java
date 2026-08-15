class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] rem = new int[60];
        for(int i = 0; i<time.length;i++){
            int rem1 = time[i] %60;
            int rem2 = (60 - rem1) % 60;
            count += rem[rem2];
            rem[rem1]++;
        }
        return count;
    }
}