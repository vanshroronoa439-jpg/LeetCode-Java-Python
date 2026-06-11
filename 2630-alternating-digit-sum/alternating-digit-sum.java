class Solution {
    public int alternateDigitSum(int n) {
        int m,t=0,s=0;
        if(String.valueOf(n).length()%2==0){
            m=-1;
        }
        else{
            m=1;
        }
        while(n>0){
            t=n%10;
            n=n/10;
            s=s+m*t;
            m=m*-1;
        }
        return(s);
    }
}