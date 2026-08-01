class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        int cost=0;
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            char c=word.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            sb.append(c);
        }
        len=sb.length();
        int low=0,high=len-1;
        while(low<high){
            char c1=sb.charAt(low);
            char c2=sb.charAt(high);
            if(map.get(c2)>map.get(c1)){
                sb.setCharAt(low,c2);
                sb.setCharAt(high,c1);
            }
            high--;
            if(high==low){
                high=len-1;
                low++;
            }
        }
        int key=1;
        for(int j=0,k=0;j<len;j++,k++){
            cost+= key*map.get(sb.charAt(j));
            if(k==7){
                key++;
                k=-1;
            }
        }
        return cost;
    }
}