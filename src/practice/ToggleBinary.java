package practice;
import java.util.*;
public class ToggleBinary {

//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		int n= sc.nextInt();
//		String Binary=Integer.toBinaryString(n);
//		
//		StringBuilder toggledbinary=new StringBuilder();
//		for(char bit : Binary.toCharArray()) {
//			if(bit=='1') {
//				toggledbinary.append('0');
//			}
//			else if(bit=='0') {
//				toggledbinary.append('1');
//			}else {System.out.println("no. other than bit");}
//		}
//		System.out.println(toggledbinary);
//		
//		int newint=Integer.parseInt(toggledbinary.toString(),2);
//		// TODO Auto-generated method stub
//		System.out.println(newint);
//	}
//}

	public static void main(String[] args)
	  {
	         Scanner sc=new Scanner(System.in);
	         int no=sc.nextInt();
	        // int p=~no;
	          String bin="";
	         // bin=(~no);
	          while(no!=0)
	           {
	                  bin=(no&1)+bin;
	                  no=no>>1;
	           }
	            bin=bin.replaceAll("1","2");
	            bin=bin.replaceAll("0","1");
	            bin=bin.replaceAll("2","0");
                int res=Integer.parseInt(bin,2);
	          System.out.println(res);
	   }
}
