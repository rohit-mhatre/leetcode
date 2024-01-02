class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (ans.size() < map.get(num)) {
                ans.add(new ArrayList<>());
            }
            ans.get(map.get(num) - 1).add(num);
        }
        return ans;
    }
}