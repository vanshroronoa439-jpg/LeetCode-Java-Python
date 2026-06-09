class Solution {
    public int lengthOfLastWord(String s) {
        String st=" ";
        s=s.trim();
        s=" "+s;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return(st.length()-1);
            }
            else{
                st=st+s.charAt(i);
            }
        }
        return(0);
    }
}