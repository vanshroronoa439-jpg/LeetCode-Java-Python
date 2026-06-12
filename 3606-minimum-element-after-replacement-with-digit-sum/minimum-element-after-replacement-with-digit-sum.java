class Solution {
    public int minElement(int[] nums) {
        int m=37,n=0;
        for(int i:nums){
            while(i>0){
                n += i%10;
                i=i/10;
            }
            m=Math.min(m,n);
            n=0;
        }
        return(m);
    }
}