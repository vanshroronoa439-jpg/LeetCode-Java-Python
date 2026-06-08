class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int c=0,l=0;
        while(letters[c]<=target){
            c++;
            l++;
            if(l==letters.length){
                return(letters[0]);
            }
        }
        return(letters[c]);
    }
}