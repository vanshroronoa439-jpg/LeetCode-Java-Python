class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        int max=0,min=101;
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            map.put(num,1);
        }
        for(int i=min;i<max;i++){
            if(map.getOrDefault(i,0)==0){
                result.add(i);
            }
        }
        return result;
    }
}