class Solution {
    public int strStr(String haystack, String needle) {
         int n = -1;
        for(int  i= 0; i< haystack.length() -needle.length()+1; i++){
            if(needle.charAt(0) == haystack.charAt(i)){

                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    n =i;
                    return n;
                }
            }
        }


        return n;
    }
}