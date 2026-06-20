class Solution {
    public int addDigits(int num) {
        int sum=0,num2=num;
        while(num>9){
            sum += num2%10;
            num2 /=10;
            if(num2==0){
                num2=sum;
                num=sum;
                sum=0;
            }
        }
        return(num);
    }
}