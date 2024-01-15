package practice;
import java.util.*;

public class FindDrow {

	public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    { 
        //declairng list and hashset
        ArrayList<Integer> result=new ArrayList<>();
        HashSet<String> remain=new HashSet<>(); 
        //logic for founding match
        for(int i=0;i<m;i++){
            StringBuilder asString=new StringBuilder();
            for(int j=0;j<n;j++){
                asString.append(matrix[i][j]);
            }
            String currentRow=asString.toString();
            if(remain.contains(currentRow)){
                result.add(i);
            }
            else{
             remain.add(currentRow);    
            }
            
        }
		return result;
        
        
        }
        public static void main(String[] args){
            // entering the element by user
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            int c=sc.nextInt();
            int [][] matrix=new int[r][c];
            for(int i=0;i<matrix.length;i++){
//            System.out.println(i);
            for(int j=0;j<matrix[i].length;j++){
                
                matrix[i][j]=sc.nextInt();
            }
            
            // calling method for finding similar row
            System.out.println(repeatedRows(matrix,r,c));
            
            
        }
        //code here
    }

}
