import java.util.Random;
class Solution {
    int[] original;
    int[] nums;
    Random rand;

    public Solution(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
        rand = new Random();
        
    }
    
    public int[] reset() {
        nums = original.clone();
        return nums;
        
    }
    
    public int[] shuffle() {
        for(int i = 0; i<nums.length;i++){
            int j = i + rand.nextInt(nums.length - i);
            swap(i, j);
        }
        return nums;
    }
    private void swap(int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
