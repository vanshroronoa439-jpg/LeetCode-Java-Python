class Solution {
    public int maxNumberOfBalloons(String text) {
        int count=0,b=0,a=0,l=0,o=0,n=0,len=text.length();
        for(int i=0;i<len;i++){
            char c=text.charAt(i);
            switch(c){
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        while(b>=1 && a>=1 && l>=2 && o>=2 && n>=1){
           b--;a--;l-=2;o-=2;n--; 
            count++;
        }
        return(count);
    }
}