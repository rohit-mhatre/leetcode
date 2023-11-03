class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int counter = 1;
        int i = 0;
        while (counter <= n && i < target.length){
            int num = target[i];
            if (num == counter){
                result.add("Push");
                i = i + 1;
                counter = counter + 1;
            }
            else{
                result.add("Push");
                result.add("Pop");
                counter = counter + 1;
            }
        }
        return result;
    }
}