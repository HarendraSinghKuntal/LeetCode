class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        for(int i = 0; i<arr.length;i++){
            int rem = arr[i] % k;
            if(rem < 0){
                rem += k;
            }
            count[rem]++;
        }
        for(int i = 1; i<k;i++){
            if(count[i] != count[k - i]){
                return false;
            }
        }
        if(count[0] % 2 != 0){
            return false;
        }
        return true;
    }
}