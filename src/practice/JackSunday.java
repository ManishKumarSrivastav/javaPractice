package practice;
import java.util.*;
public class JackSunday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n= sc.nextInt();
		String []arr= {"mon","tue","whe","thu","fri","sat","sun"};
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(s)) {
				break;
			}
			int res=1;
			int rem=6-i;
			n=n-rem;
			if(n>0) {
				res+=n/7;
				System.out.println(res);
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
