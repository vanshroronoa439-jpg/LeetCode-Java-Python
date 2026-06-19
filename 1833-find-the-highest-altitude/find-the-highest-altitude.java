class Solution {
    public int largestAltitude(int[] gain) {
        int amax=0,n=gain.length;
        int[] altitudes=new int[n+1];
        altitudes[0]=0;
        for(int i=0;i<n;i++){
            altitudes[i+1]=gain[i]+altitudes[i];
            if(altitudes[i+1]>amax){
                amax=altitudes[i+1];
            }
        }
        return(amax);
    }
}