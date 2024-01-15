package practice;
import java.util.*;
public class ThreatsF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		//int res=sumOfDigit(n);
		
			int sum=0,dig,gsum,grandsum=0;
			while(n%10!=0) {
				dig=n%10;
				sum+=dig;
				n=n/10;
				
			}
			if(r<=0) {
				System.out.println(grandsum);
			}
			else if(r>0) {
				gsum=r*sum;
				int d;
				System.out.println(gsum);
				while(gsum%10!=0|| gsum!=0) {
					d=gsum%10;
					grandsum+=d;
					gsum=gsum/10;
				}
				System.out.println(grandsum);
			}
		}
		// TODO Auto-generated method stub

	}


