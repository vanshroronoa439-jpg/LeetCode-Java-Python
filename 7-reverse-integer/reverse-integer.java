class Solution {
    public int reverse(int x) {
        long nx=0;
        boolean neg=false;
        if(x<0){
            x += -2*x;
            neg=true;
        }
        while(x>0){
            nx=nx*10 + x%10;
            x=x/10;
        }
        if(neg){
            nx=nx*(-1);
        }
        if(nx<-Math.pow(2,31) || nx>Math.pow(2,31)-1){
            return(0);
        }
        return((int)(nx));
    }
}