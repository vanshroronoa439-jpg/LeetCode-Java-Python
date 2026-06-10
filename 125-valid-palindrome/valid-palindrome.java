class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String st1="",st2="";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c>=97 && c<=122 || c>=48 && c<=57){
                st1=st1+c;
                st2=c+st2;
            }
        }
        if(st1.equals(st2)){
            return(true);
        }
        return(false);
    }
}