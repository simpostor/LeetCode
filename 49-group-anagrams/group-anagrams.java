class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs){
            //make key
            int[] key = new int[26];
            for(char c : str.toCharArray()){
                key[c - 'a']++;
            }
            String keyString = Arrays.toString(key);
            anagrams.putIfAbsent(keyString, new ArrayList<>());
            anagrams.get(keyString).add(str);
        }
        return new ArrayList(anagrams.values());
    }
}