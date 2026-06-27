class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length(), index;
        if(len!=goal.length()){
            return false;
        }
        for(int i=len-1;i>=0;i--){
            index=goal.indexOf(s.substring(i,len));
            if(index==0 && goal.substring(len-i).equals(s.substring(0,i))) {
                return true;
            }
        }
        return false;
    }
}