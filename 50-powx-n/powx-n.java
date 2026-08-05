class Solution {
    public double myPow(double x, int n) {
        double result=Math.pow(x,n);
        if(result>=Math.pow(-2,31) && result<=Math.pow(2,31)){
            return result;
        }
        else{
            return 0;
        }
    }
}