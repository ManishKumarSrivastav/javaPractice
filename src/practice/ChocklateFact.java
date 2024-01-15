package practice;
import java.util.*;
public class ChocklateFact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
          int [] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
			 int j=i+1;
			 while (j < arr.length && arr[j] == 0) {
                 j++;
             }
				 if(j<arr.length) {
					 arr[i]=arr[j];
					 arr[j]=0;
				 } 
			}
			  
			
		}
		for(int num : arr) {
			  System.out.print(num+" ");
		  }
		// TODO Auto-generated method stub

	}
		
		// TODO Auto-generated method stub

	}


