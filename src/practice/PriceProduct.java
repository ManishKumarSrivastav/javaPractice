package practice;
import java.util.*;
public class PriceProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price=1,div;
		while(n%10>0) {
			div=n%10;
			price*=div;
			n=n/10;
		}
		System.out.println(price);
		// TODO Auto-generated method stub

	}

}
