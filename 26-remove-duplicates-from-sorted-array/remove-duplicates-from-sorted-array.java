class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length,lastuniquenum=nums[0]-1,j=0,k=0;
        int[] a=new int[len];
        for(int i:nums){
            if(lastuniquenum != i){
                lastuniquenum=i;
                nums[j]=i;
                j++;
                k++;
            }
        }
        return(k);
    }
}