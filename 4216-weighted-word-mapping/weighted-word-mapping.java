class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int sum=0;
        StringBuilder st=new StringBuilder();
        char c;
        for(String s:words){
            for(int i=0;i<s.length();i++){
                c=s.charAt(i);
                sum +=weights[c-'a'];
            }
            st.append((char)('z'-(sum % 26)));
            sum=0;
        }
        return(st.toString());
    }
}