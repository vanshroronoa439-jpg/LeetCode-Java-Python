class Solution {
    public String processStr(String s) {
        char c;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='*'){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);

                }
            }
            else if(c=='#'){
                result.append(result);
            }
            else if(c=='%'){
                result.reverse();
            }
            else{
                result.append(c);
            }
        }
        return(result.toString());
    }
}