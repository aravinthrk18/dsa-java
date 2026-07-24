import java.util.*;
public class greatorarea
{
	public static void main(String[] args) {
	
	    int arr[]={2,5,3,4,5};
	    int curr=0;
	    int maxi=Integer.MIN_VALUE;
	    
	    for(int i=0;i<arr.length;i++){
	        curr=arr[i];
	        
	        for(int j=i-1;j>=0 && arr[j]>=arr[i];j--){
	            curr+=arr[i];
	        }
	        
	        for(int j=i+1;j<arr.length&& arr[j]>=arr[i] ;j++){
	            curr+=arr[i];
	        }
	        
	        maxi=Math.max(maxi, curr);
	    }
	    
	    System.out.println(maxi);
	}
}