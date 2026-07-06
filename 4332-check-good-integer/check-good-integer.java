class Solution {
    public boolean checkGoodInteger(int n) {
        return squaresum(n)-digitsum(n)>=50;    
    }
    public int digitsum(int n){
        int sum=0;
        while(n>0){
            int rem = n % 10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public int squaresum(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}