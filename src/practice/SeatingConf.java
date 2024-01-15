package practice;
import java.util.*;
public class SeatingConf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ways=2*fact(n-1);
		System.out.println(ways);
				
		// TODO Auto-generated method stub

	}
	public static int fact(int n) {
		if(n<=0) {return 1;}
		return n*fact(n-1);
	}

}
