package practice;
import java.util.*;
public class SheetCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int result=findMaxChar(s,n);
		System.out.println(result);
		//String s1;
		
		// TODO Auto-generated method stub

	}
  private static int findMaxChar(String s,int n) {
	int max=0;
	for(int i=0;i<s.length()-n;i+=n) {
		String s1=s.substring(i,i+n);
		int counta=countOccurence(s1, 'a');
		max=Math.max(max, counta);
		
	}
	if(s.length()%n!=0) {
		String leftString=s.substring(s.length()-s.length()%n);
		int counta=countOccurence(leftString,'a');
		max=Math.max(max, counta);
		
	}
	
	return max;
  }
  private static int countOccurence(String s1,char a) {
	  int count=0;
	  for(int i:s1.toCharArray()) {
		  if(i=='a') {count++;}
	  }
	  
	  return count;
  }
}
