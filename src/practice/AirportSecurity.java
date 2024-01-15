package practice;
import java.util.*;
public class AirportSecurity {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	Arrays.sort(arr);
	
	for(int item:arr) {
		System.out.println(item+" ");
	}
		// TODO Auto-generated method stub

	}

}
