class Solution {
    public long sumAndMultiply(int n) {
        int sum=0,digit=0,i=0;
        long x=0;
        while(n>0){
            digit=n%10;
            if(digit!=0){
                sum += digit;
                x = x +digit*(long)(Math.pow(10,i));
                i++;
            }
            n=n/10;
        }
        return(sum*x);
    }
}