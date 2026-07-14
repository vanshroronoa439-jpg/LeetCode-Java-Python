class Solution {
    public String reverseWords(String s) {
        s = s +" ";
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<len;i++){
            String c=String.valueOf(s.charAt(i));
            if(!c.equals(" ")){
                sb.append(c);
            }
            else{
                sb.reverse();
                sb.append(" ");
                result.append(sb);
                sb.setLength(0);
            }
        }
        return result.toString().trim();
    }
}