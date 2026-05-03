class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char task: tasks) {
            count[task - 'A']++;
        }

        Arrays.sort(count);

        int maxFreq = count[25];
        int maxCount = 1;
        int time = 1;
        for (int i = 24; i >=0; i--) {
            time++;
            if (count[i] == maxFreq) {
                maxCount++;
            } else {
                break;
            }
        }

        int partCount = maxFreq - 1;
        int partLen = n + 1;
        int minTime = partCount * partLen + maxCount;
        return Math.max(minTime, tasks.length);
    }
}
