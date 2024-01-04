class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int result = 0;
        for (int i:map.keySet()){
            if(map.get(i) == 1){
                return -1;
            }
            int size = map.get(i);
            result += (size/3) + (size%3 != 0 ? 1 : 0);
        }
        return result;
    }
}