class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0, sumEven=0,odd=1,even=2;
        int gcd=0;
        for(int i=1;i<=n;i++){
            sumOdd += odd;
            odd+=2;
            sumEven +=even;
            even+=2;
        }
        for(int j=1;j<=sumOdd;j++){
            if(sumOdd%j==0 && sumEven%j==0){
                gcd=j;
            }
        }
        return (gcd);
    }
}