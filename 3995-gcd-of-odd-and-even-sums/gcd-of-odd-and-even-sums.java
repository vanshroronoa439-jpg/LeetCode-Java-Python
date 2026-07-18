class Solution {
    public int gcdOfOddEvenSums(int n) {
        int min=0,max=0,num=1;
        for(int i=1;i<=n;i++){
            min += num;
            max +=num+1;
            num+=2;
        }
        while(min!=0){
            num=max%min;
            max=min;
            min=num;
        }
        return (max);
    }
}