class Solution {
    public String reverseWords(String s) {
         String [] ss = s.trim().split("\\s+"); //this can remove the all spaces from leading, trailing and middle
        String sss ="";
        for(int i =ss.length -1; i>=0; i--){
            sss += ss[i] + " ";
        }
        sss = sss.trim(); //triming again for last space
       return sss;
    }
}