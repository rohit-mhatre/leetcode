class Solution {
    public String reverseVowels(String s) {
        //Strings are immutable in java so we have to create character array over here?
        char[] word = s.toCharArray();
        //Initiate two pointers one from start, other from end?
        int start = 0; int end = s.length()-1;
        //Lemme just initiate a set so that i can put all my vowels over there?
        Set <Character> vowelsSet = new HashSet<>();
        vowelsSet.add('a');
        vowelsSet.add('A');
        vowelsSet.add('e');
        vowelsSet.add('E');
        vowelsSet.add('i');
        vowelsSet.add('I');
        vowelsSet.add('o');
        vowelsSet.add('O');
        vowelsSet.add('u');
        vowelsSet.add('U');
        while(start < end){
            //start ointer moving till it finds vowel and end pointer also moving till it finds vowel 
            while (start < end && !vowelsSet.contains(word[start])){
                start = start + 1;
            }
            while (start < end && !vowelsSet.contains(word[end])){
                end = end - 1;
            }
            //lemme just swap the vowels we found?
            char c = word[start];
            word[start] = word[end];
            word[end] = c;

            start = start + 1;
            end = end - 1;
        }
        String res = new String(word);
        return res;
    }
}