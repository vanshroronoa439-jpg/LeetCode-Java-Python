class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i= 1;i<(s.length()/2)+1;i++){
            String st=s.substring(0,i);
            StringBuilder check=new StringBuilder(st);
            while(check.length()<s.length()){
               check.append(st);
            }
            if((String.valueOf(check)).equals(s)){
                return true;
            }
        }
        return false;
    }
}