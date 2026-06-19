class Solution {
    public int largestAltitude(int[] gain) {
        int amax=0,n=gain.length,a=0,l=0;;
        for(int i=0;i<n;i++){
            a=gain[i]+l;
            if(a>amax){
                amax=a;
            }
            l=a;
        }
        return(amax);
    }
}