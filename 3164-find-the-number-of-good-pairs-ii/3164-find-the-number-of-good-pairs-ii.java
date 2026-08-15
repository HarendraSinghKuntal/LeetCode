class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
       long count = 0;
       int max = 0;
       for(int num : nums2){
        max = Math.max(max, num);
       } 
       int[] freq = new int[max + 1];
       for(int num : nums2){
        freq[num]++;
       }
       for(int num : nums1){
        if(num % k != 0){
            continue;
        }
        int x = num/k;
        for(int i = 1; i * i <= x  ;i++){
            if(x % i == 0){
                if(i <= max){
                    count += freq[i];
                }
                int a = x / i;
                if(a != i && a <= max){
                    count += freq[a];
                }
            }
        }
       }
       return count;
    }
}