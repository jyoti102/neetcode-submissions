class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for(String str: strs) {
            if (result.isEmpty()) {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                result.add(strList);
            } else {
                List<String> anagramSet = new ArrayList<>();
                List<String> listToRemove = new ArrayList<>();
                
                for (List<String> strList: result) {
                    if (checkAnagram(strList.get(0), str)) {
                        anagramSet.addAll(strList);
                        listToRemove.addAll(strList);
                        break;
                    }
                }
                anagramSet.add(str);

                result.remove(listToRemove);
                result.add(anagramSet);
            }

        }
        return result;
    }

    boolean checkAnagram(String s1, String s2) {
        int[] arr = new int[127];
        for(int i: s1.chars().toArray()) {
            arr[i-1] = arr[i-1] + 1;
        }

        for(int i: s2.chars().toArray()) {
            arr[i-1] = arr[i-1] - 1;
        }

        for(int i: arr) {
            if (i != 0) 
                return false;
        }

        return true;
    }
}
