class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String sortedArr=new String(arr);
            if(!map.containsKey(sortedArr)){
                map.put(sortedArr,new ArrayList<>());
            }
             map.get(sortedArr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}