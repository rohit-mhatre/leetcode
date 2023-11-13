class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1.length == 0 || word2.length == 0){
            return false;
        }
        StringBuilder a1 = new StringBuilder();
        StringBuilder a2 = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length, word2.length); i++) {
            if (i < word1.length){
                a1.append (word1[i]);
            }
            if (i < word2.length){
                a2.append (word2[i]);
            }
        }
        return a1.toString().equals(a2.toString());
    }
}