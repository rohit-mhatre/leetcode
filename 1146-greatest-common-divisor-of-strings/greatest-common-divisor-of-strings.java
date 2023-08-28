class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //if both strings are equal just return any string as final str = str1 + str2 = 2*str1, so basically just return any string
        if(str1.equals(str2)){
            return str1;
        }
        //baiscally the substring lies in first portion of the string so we can just compare them to see if they do the needful
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
        //if second string is greater than first string just interchange them and apply recusion so that we check for third condition
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);
        }
        //otherwise return the blank string
        return "";
    }
}