class Solution {
    public void reverseString(char[] s) {
        int low=0;
        char t;
        int high=s.length-1;
        while(low<high){
            t=s[low];
            s[low]=s[high];
            s[high]=t;
            low++;
            high--;
        }
        System.out.println(s);
    }
}