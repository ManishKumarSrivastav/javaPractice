package practice;
import java.util.*;
public class FindingPGrater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=1,max=arr[1];
		for(int i=0;i<n;i++) {
			    if(arr[i]>=max) {
			    	++count;
			    	max=arr[i];
			    }
		
		}
		System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}
