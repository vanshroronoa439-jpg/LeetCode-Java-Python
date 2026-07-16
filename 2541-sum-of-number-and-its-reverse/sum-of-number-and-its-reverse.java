class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        int digit=0,revnum=0,n=0;
        for(int i=num/2;i<num;i++){
            n=i;
            while(n>0){
                digit=n%10;
                revnum =revnum*10 + digit;
                n=n/10;
            }
            if(num==i+revnum){
                return true;
            }
            revnum=0;
        }
        return false;
    }
}