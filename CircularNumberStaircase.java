// 8. Circular Number Staircase Pattern
// Problem Statement
// Print an N × N pattern where each row is a circular left shift of the previous row.
// Sample Input
// 5
// Sample Output
// 1 2 3 4 5
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4

// soln :

import java.util.*;
public class CircularNumberStaircase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();		
		    
		}
	for(int k=0;k<=n-1;k++){	
	    
		for(int i=k;i<n;i++){
		    
		    System.out.print(arr[i]+" ");
		    
		}
		
		for(int j=0;j<k;j++){
		    System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	 
	    
	
		
	}
}
