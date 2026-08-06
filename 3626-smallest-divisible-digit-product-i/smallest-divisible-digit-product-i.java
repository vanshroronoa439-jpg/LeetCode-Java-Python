class Solution {
    public int smallestNumber(int n, int t) {
        int product=t+1, n_copy=n,digit=0;
        while(product %t !=0){
            product=1;
            n=n_copy;
            n_copy++;
            while(n>0){
                digit=n%10;
                product *= digit;
                n /=10;
            }
            n=n_copy-1;
        }
        
        return n;
    }
}