class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i= 1;i<(s.length()/2)+1;i++){
            if(n%i==0){
                String st=s.substring(0,i);
                StringBuilder check=new StringBuilder(st);
                while(check.length()<s.length()){
                check.append(st);
                }
                if(check.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}