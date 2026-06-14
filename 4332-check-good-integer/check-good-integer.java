class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0,ss=0;
        while(n>0){
            ds += n%10;
            ss += (n%10)*(n%10);
            n=n/10;
        }
        if(ss-ds>=50){
            return true;
        }
        return false;
    }
}