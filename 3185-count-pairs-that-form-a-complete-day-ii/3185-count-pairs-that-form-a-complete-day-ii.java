class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count = 0;
        long[] rem = new long[24];
        for(int i = 0; i<hours.length;i++){
            int rem1 = hours[i] % 24;
            int rem2 = (24 - rem1) % 24;
            count += rem[rem2];
            rem[rem1]++;
        }
        return count; 
    }
}