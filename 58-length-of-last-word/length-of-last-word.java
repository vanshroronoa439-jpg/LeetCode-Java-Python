class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        s=s.trim();
        s=" "+s;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                c++;
            }
        }
        return(c);
    }
}