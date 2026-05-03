class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int required = target - numbers[i];
            if (map.containsKey(required)) {
                int index = map.get(required);
                return new int[] {index+1, i+1};
            }
            map.put(numbers[i],i);
        }
        return null;
    }
}
