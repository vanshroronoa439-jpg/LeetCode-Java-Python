bool isPalindrome(int x) {
    long digit=0,revnum=0,num=x;
    while(x>0){
        digit=x%10;
        revnum =revnum*10 + digit;
        x /=10;
    }
    return (num==revnum)?true:false;
}