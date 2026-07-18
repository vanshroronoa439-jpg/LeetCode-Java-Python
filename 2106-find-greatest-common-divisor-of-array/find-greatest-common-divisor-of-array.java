class Solution {
    public int findGCD(int[] nums) {
        int max=0,min=1001,gcd=0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        for(int num2:nums){
            if(num2<min){
                min=num2;
            }
        }
        for(int i=1;i<=min;i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}