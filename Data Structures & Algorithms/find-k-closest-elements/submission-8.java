class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l = 0, r = n - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int left = l - 1; 
        int right = l; 
        List<Integer> res = new ArrayList<>(); 

        while (res.size() < k) {

            if (left >= 0 && right < n) {
                if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                    res.add(arr[left--]); 
                } else {
                    res.add(arr[right++]); 
                } 
            } else if (left >= 0) { 
                res.add(arr[left--]); 
            } else { 
                res.add(arr[right++]); 
            } 
        } 

        Collections.sort(res); 
        return res;
    }
}