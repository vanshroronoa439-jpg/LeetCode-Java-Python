class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len1=s.length(),len2=t.length();
        int sum1=0, sum2=0;
        for(int i=0;i<len1;i++){
            char c=s.charAt(i);
            sum1 +=c;
        }
        for(int j=0;j<len2;j++){
            char ch=t.charAt(j);
            sum2 +=ch;
        }
        
        return (char)(sum2-sum1);
    }
}