class Solution {
    public String reverseOnlyLetters(String s) {
        int low=0,high=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(low<high){
            char c1=s.charAt(low);
            char c2=s.charAt(high);
            if((c1>=65 && c1<=90) || (c1>=97 && c1<=122)){
                if((c2>=65 && c2<=90) || (c2>=97 && c2<=122)){
                    sb.setCharAt(high,c1);
                    sb.setCharAt(low,c2);
                    low++;
                    high--;
                }
                else{
                    high--;
                }
            }
            else{
                low++;
            }
        }
        return(sb.toString());
    }
}