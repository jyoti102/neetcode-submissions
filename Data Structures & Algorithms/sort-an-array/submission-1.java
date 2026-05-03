class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length - 1);
       return nums;
    }

    void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l1 = new int[n1];
        int[] l2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            l1[i] = nums[i + left];
        }        

        for (int i = 0; i < n2; i++) {
            l2[i] = nums[i + mid + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (l1[i] < l2[j]) 
                nums[k++] = l1[i++];
            else 
                nums[k++] = l2[j++];
        }
        
        while (i < n1) {
            nums[k++] = l1[i++];
        }

        while (j < n2) {
            nums[k++] = l2[j++];
        }
    }

}