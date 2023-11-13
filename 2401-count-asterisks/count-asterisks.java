class Solution {
    public int countAsterisks(String s) {
       boolean var = false;
       int count = 0;
       for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == '|') {
               var = !var;
           }
           if(!var && s.charAt(i) == '*'){
               count += 1;
           }
       } 
       return count;
    }
}