class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            String sortedStr = sortString(str);
            List<String> strList = new ArrayList<>();
            if (map.isEmpty()) {
                strList.add(str);
                map.put(sortedStr, strList);
            } else {
                if (map.containsKey(sortedStr)) {
                    strList = map.get(sortedStr);
                }
                strList.add(str);
                map.put(sortedStr, strList);
            }

        }

        map.forEach((key,value) -> {
            result.add(value);
        });
        return result;
    }

    String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
