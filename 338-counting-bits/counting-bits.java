class Solution {
    public int[] countBits(int n) {
        //first of all create an array with size n+1 as we are taking 0 in consideration as well
        int[] result = new int[n+1];
        //run the loop with stopping condition till n
        for(int i=0;i<=n;i++){  
            //so the thinking is if you check the binary numbers from 0 to 10 you observe a trend. Such that every odd numbers have one more bit than their preceding one. The case is not same for even numbers, there goes a trend that is as follows:
            if(i%2 == 0){
                result[i] = result[i/2];
            }
            else{
                result[i] = result[i/2]+1;
            }
        }
        return result;
    }
}