class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums[((nums.length+1)/2)-1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.get(n)==1 ;
    }
}