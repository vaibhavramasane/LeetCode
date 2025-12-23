class PalindromeNumberQues9{ 
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        int original =x,rev=0;
        while(x!=0){

            int digit = x % 10;
            rev = rev * 10 + digit;
            x/=10;
        }
        return original == rev;
    }
    public static void main(String x[]){
        PalindromeNumberQues9 sol = new PalindromeNumberQues9();
        System.out.println(sol.isPalindrome(121));
    }
}
	