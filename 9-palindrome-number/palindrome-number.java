class Solution {
    public boolean isPalindrome(int x) {
        int n,y=x,s=0;
        while(x>0){
           n=x%10;
           x=x/10;
           s=s*10+n;
        }
        if(s==y)
           return(true);
        else
           return(false);
    }
}