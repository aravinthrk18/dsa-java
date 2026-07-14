// 7. Maximum Triangle Sum in a Matrix
// Problem Statement
// Split the matrix along the anti-diagonal, compute the sums of both triangular regions, and print the
// larger sum.
// Sample Input
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output
// 38


// soln :

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Matrixx
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(j<=n-i-1){
		            sum1+=arr[i][j];
		        }
		       if(j>=n-i-1){
		           sum2+=arr[i][j];
		       }
		    }
		}
		
		if(sum1>sum2){
		    System.out.print(sum1);
		}
		else{
		    System.out.print(sum2);
		}
		
		
	}
}