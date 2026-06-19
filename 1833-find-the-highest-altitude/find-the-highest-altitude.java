class Solution {
    public int largestAltitude(int[] gain) {
        int amax=0,a=0;
        for(int g:gain){
            a +=g;
            amax=Math.max(amax,a);
        }
        return(amax);
    }
}