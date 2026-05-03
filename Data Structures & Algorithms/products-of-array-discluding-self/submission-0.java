class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                prod *= nums[i];
            }
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 0) {
                res[i] = prod/nums[i];
            } else if (zeroCount == 1 && nums[i] == 0){
                res[i] = prod;
            }
        }
        return res; 
    }
}  
