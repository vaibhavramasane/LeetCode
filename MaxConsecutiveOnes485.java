//Max consecutive ones : given a binary array return maximum ones
import java.util.*;

class MaxConsecutiveOnes485{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = xyz.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element in an array: ");
		for(int i=0; i<a.length; i++){
			
			a[i] = xyz.nextInt();
			
		}
		int res = MaxOnes(a);
		System.out.println("MAXIMUM CONSECUTIVE ONES: " + res);
		
	}
	public static int maxelement(int a, int b){
		
		return a>b?a:b;
		
	}
	
	public static int MaxOnes(int az[]){
		
		int maxcount = 0;
		int currentcount = 0;
		for(int arr: az){
			
			if(arr==1){
				
				currentcount++;
				
			}else{
				
				maxcount= maxelement(maxcount,currentcount);
				currentcount =0;
			}
		}
		maxcount = maxelement(maxcount,currentcount);
		return maxcount;
	}
	
}

	