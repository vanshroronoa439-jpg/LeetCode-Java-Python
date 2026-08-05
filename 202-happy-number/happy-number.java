class Solution {
    public boolean isHappy(int n) {
        int rem=0,sum=0;
        HashSet<Integer> seen=new HashSet<>();
        do{
            while(n>0){
                rem=n%10;
                sum += rem*rem;
                n /=10;
            }
            n=sum;
            if(seen.contains(sum)){
                return false;
            }
            seen.add(sum);
            sum=0;
        }while(n!=1);
        return true;
    }
}