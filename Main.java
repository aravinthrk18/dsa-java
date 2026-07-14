// Given strings S1 and S2, find the first occurrence of every character of S2 in S1 and print the
// substring spanning the minimum and maximum indices.
// Sample Input
// S1 = ZOHOCORPORATION
// S2 = PORT
// Sample Output
// OHOCORPORAT


// soln:


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s1="ZOHOCORPORATION";
	    String s2 ="PORT";
	    int mini=Integer.MAX_VALUE;
	    int maxi=Integer.MIN_VALUE;
	    for(int i=0;i<s2.length();i++){
	        for(int j=0;j<s1.length();j++){
	        if(s1.charAt(j)==s2.charAt(i)){
	            mini=Math.min(j,mini);
	            maxi=Math.max(j,maxi);
	            break;
	        }
	        }
	        
	    }
	    
	    for(int i =mini;i<=maxi;i++){
	        System.out.print(s1.charAt(i));
	    }
	    
	    
	    
	}
}
