class Solution {
    public boolean checkRecord(String s) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                c1++;
                if(c1>=2){
                    return(false);
                }
            }
        }
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='L'){
                c2++;
                if(c2>=3){
                    return(false);
                }
            }
            else{
                c2=0;
            }
        }
        return(true);
    }
}