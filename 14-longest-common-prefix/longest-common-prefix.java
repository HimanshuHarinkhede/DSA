import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);  /*this is for sorting, after sorting we just have to compare first and last words*/
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        String k = "";
        for(int i =0; i<str1.length() && i< str2.length(); i++){ 
            if(str1.charAt(i) == str2.charAt(i)){
                k = k + str1.charAt(i);
            } else {break;};
        }
        return k;
    }
}