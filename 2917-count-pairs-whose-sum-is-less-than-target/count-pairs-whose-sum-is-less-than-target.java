class Solution{
    public int countPairs(List<Integer> nums, int t){
        int s = 0;
        for(int i=0; i<nums.size()-1; i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j)<t) s++;
            }
        }
        return s;
    }
}