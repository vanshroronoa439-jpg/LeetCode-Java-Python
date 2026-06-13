class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int sum=0;
        String st="";
        char c;
        for(String s:words){
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                sum +=weights[c-97];
            }
            st=st+(char)(122-(sum % 26));
            sum=0;
        }
        return(st);
    }
}