package practice;
import  java.util.*;
import java.util.function.Predicate;

public class PollutionOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input declaration
		int n=sc.nextInt();
		int []arr=new int[n];
		
		//arr input
				for(int i=0;i<arr.length;i++) {
					arr[i]=sc.nextInt();
				}
		
		//date format input check
		int udate=sc.nextInt();
		Predicate<Integer> validDate=(date)->date>=1 && date<=31?true :false;
		if(validDate.test(udate)) {System.out.println("valid date");}
		else {System.out.println("Invalid date, please enter right one");}
		
		//fine input
		int finer=sc.nextInt();
		
		
		//logic for fine calculation
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
		if(isEven(arr[i]) && isEven(udate)) {
			//System.out.println("you have evendate with even vehicle no.! No fine");
			continue;
			
		}
		else if(isOdd(arr[i]) && isOdd(udate)) {continue;}
		else {
		 count++;
			
		}
		}
		int fine=finer*count;
		System.out.println(count+" vehicel violate rule "+" = "+fine+"collected");
		
		
		
		
		// TODO Auto-generated method stub

	}
	private static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
		
	}
	private static boolean isOdd(int n) {
		if(n%2!=0) {
			return true;
		}
		return false;
		
	}

}
