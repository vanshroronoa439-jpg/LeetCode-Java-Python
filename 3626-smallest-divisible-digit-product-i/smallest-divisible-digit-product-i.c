int smallestNumber(int n, int t) {
    int digit=0,dp=1,n_og=n;
    while(dp%t!=0){
        n=n_og;
        dp=1;
        n_og++;
        while(n>0){
            digit=n%10;
            dp *= digit;
            n /=10;
        }
        n=n_og-1;
    }
    return n;
}