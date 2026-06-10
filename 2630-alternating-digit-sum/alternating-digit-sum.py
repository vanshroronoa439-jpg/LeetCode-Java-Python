class Solution(object):
    def alternateDigitSum(self, n):
        b=0 
        s=0 
        if((len(str(n))-1)%2==0):
            k=2
        else:
            k=3
        while n>0:
            b=n%10
            n=n//10
            if(k%2==0):
                s=s+b
            else:
                s=s-b
            k +=1
        return(s)