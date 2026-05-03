class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] fq = new ArrayList[nums.length + 1];

        for (int i = 0; i < fq.length; i++) {
            fq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            fq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int j = 0;
        for (int i = fq.length - 1; i > 0 && j < k; i--) {
            for (int n : fq[i]) {
                result[j++] = n;
                if (j == k) {
                    return result;
                }
            }
        }
        
        return result;
    }
}
