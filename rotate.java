// 1. Alternate Sorting of an Array
// Problem Statement
// Given an array of integers, rearrange the elements in alternate order as specified by the problem
// requirements and print the resulting array.
// Sample Input
// 1 2 3 4 5 6 7
// Sample Output
// (Arrange in alternate order)


// soln :


// *******************************************************************************/
import java.util.*;
public class rotate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int arr[]={1,2,3,4,5,6,7};//7,1,6,2,5,3,4
	    int res[]=new int[arr.length];
	    
	    
	    int l=0;
	    int r=arr.length-1;
	    int i=0;
	    while(l<r){
	            res[i]=arr[r];
	            res[i+1]=arr[l];
	            i+=2;
	        
	        l++;
	        
	        r--;
	    }
	    
	    if(l==r){
	        res[i]=arr[l];
	    }
	    
	   for(int j=0;j<arr.length;j++){
	       System.out.print(res[j]+" ");
	   }
	    
	    
	    
	}
}

