import java.util.*;
class LeetCode50{
    public double myPow(double x, int n) {
        
        return Math.pow(x,n);
        
    }
	public static void main(String args[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Base: ");
		double x = xyz.nextDouble();
		
		System.out.println("Enter Power: ");
		int n = xyz.nextInt();
		
		LeetCode50 lt = new LeetCode50();
		double result = lt.myPow(x,n);
		
		System.out.println("x raised to the power n " + result);
		
	}
	
}