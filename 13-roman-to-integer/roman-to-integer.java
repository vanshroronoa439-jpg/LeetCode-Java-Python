class Solution { 
    public int romanToInt(String s) { 
        HashMap<Character,Integer> map=new HashMap<>(); 
        int maxval=0; 
        int num=0; 
        map.put('I',1); 
        map.put('V',5); 
        map.put('X',10); 
        map.put('L',50); 
        map.put('C',100); 
        map.put('D',500); 
        map.put('M',1000); 
        StringBuilder sb=new StringBuilder(s); 
        sb=sb.reverse(); 
        int len=sb.length(); 
        for(int i=0;i<len;i++){ 
            char c=sb.charAt(i); 
            int val=map.get(c); 
            if(val>=maxval){ 
                maxval=val; 
                num += val; 
            } 
            else{ 
                num -= val; 
            } 
        } 
        return(num); 
    } 
}