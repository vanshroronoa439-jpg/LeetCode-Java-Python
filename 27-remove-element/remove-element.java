class Solution {
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int low=0,high=len-1, t=0;
        int k=0;
        if(high<0){
            return 0;
        }
        if(high==0){
            if(nums[0]==val){
                return 0;
            }
            else{
                return 1;
            }
        }
        while(low<=high){
            if(nums[low]==val && nums[high]!=val){
                t=nums[low];
                nums[low]=nums[high];
                nums[high]=t;
                low++;
                high--;
            }
            else if(nums[low]==val && nums[high]==val){
                high--;
            }
            else if(nums[low]!=val && nums[high]!=val){
                low++;
            }
            else{
                high--;
                low++;
            }
        }
        int i=0;
        while(nums[i]!=val){
            k++;
            i++;
            if(i>=len){
                break;
            }
        }
        return k;
    }
}