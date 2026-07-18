class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0, sumEven=0,num=1;
        int gcd=1;
        for(int i=1;i<=n;i++){
            sumOdd += num;
            sumEven +=num+1;
            num+=2;
        }
        int min=sumOdd;
        int max=sumEven;
        while(min!=0){
            gcd=max%min;
            max=min;
            min=gcd;
        }
        return (max);
    }
}