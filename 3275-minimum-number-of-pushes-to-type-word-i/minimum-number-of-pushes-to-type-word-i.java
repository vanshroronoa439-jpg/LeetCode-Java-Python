class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        int cost=0,key=1;
        for(int i=0,j=0;i<len;i++,j++){
            cost += key;
            if(j==7 && i<len-1){
                j=-1;
                key++;
            }
        }
        return cost;
    }
}