class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        StringBuilder st=new StringBuilder(word);
        while(sequence.contains(st)){
            st.append(word);
            count++;
        }
        return(count);
    }
}