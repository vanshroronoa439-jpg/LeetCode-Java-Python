class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st=new StringBuilder();
        StringBuilder st2=new StringBuilder();
        for(String w1: word1){
            st.append(w1);
        }
        for(String w2: word2){
            st2.append(w2);
        }
        if(st.compareTo(st2)==0){
            return true;
        }
        return false;
    }
}