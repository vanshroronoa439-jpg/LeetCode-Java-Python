class Solution {
    public int firstUniqChar(String s) {
        StringBuilder sb=new StringBuilder(s);
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            sb.deleteCharAt(i);
            s=sb.toString();
            if(!s.contains(String.valueOf(c))){
                return i;
            }
            else{
                sb.insert(i,c);
            }
            s=sb.toString();
        }
        return -1;
    }
}