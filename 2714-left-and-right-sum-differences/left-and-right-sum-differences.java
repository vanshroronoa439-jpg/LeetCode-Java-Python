class Solution {
    public int[] leftRightDifference(int[] nums) {
        int m=nums.length;
        int[] leftsum=new int[m];
        int[] rightsum=new int[m];
        int[] answer=new int[m];
        int j,n,p=0;
        for(int i=0;i<m;i++){
            j=i;
            n=i;
            while(j>=0){
                leftsum[p]=leftsum[p]+nums[j];
                j--;
            }
            while(n<m){
                rightsum[p]=rightsum[p]+nums[n];
                n++;
            }
            answer[p]=Math.abs(leftsum[p]-rightsum[p]);
            p++;
        }
        return(answer);
    }
}