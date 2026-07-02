class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length(),j=0;
        if(len==0){
            return 0;
        }
        if(len==1){
            return 1;
        }
        double maxlen =0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<len;i++){
            String c=String.valueOf(s.charAt(i));
            if(sb.indexOf(c)<0){
                sb.append(c);
            }
            else{
                maxlen=Math.max(maxlen,sb.length());
                sb.delete(0,sb.length());
                i=j;
                j++;
            }
        }
        maxlen=Math.max(maxlen,sb.length());
        return((int)(maxlen));
    }
}