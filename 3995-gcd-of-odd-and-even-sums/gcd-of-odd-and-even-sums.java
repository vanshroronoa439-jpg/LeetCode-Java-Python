class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0, sumEven=0,odd=1,even=2;
        int gcd=1;
        for(int i=1;i<=n;i++){
            sumOdd += odd;
            odd+=2;
            sumEven +=even;
            even+=2;
        }
        int min=(int)Math.min(sumOdd,sumEven);
        int max=(int)Math.max(sumOdd,sumEven);
        while(max%min!=0){
            gcd=max%min;
            if(gcd<min){
                min=gcd;
            }
            else{
                max=gcd;
            }
        }
        return (gcd);
    }
}