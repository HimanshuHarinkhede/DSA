class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;
        for(int i =s.length()-1; i>=0;i--){
            if(s.charAt(i) != ' '){
                k++;
            } else if(k>0){ //this will ignore the starting spaces from last index(k>0) //if k was not gretar than 0 means till now there is no word found

                break;
            }
        }
        return k;
    }
}