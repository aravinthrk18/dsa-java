

// Given a numeric string followed by arithmetic operators, evaluate the expression according to the
// specified rules.
// Sample Input
// 12345*+-+
// Sample Output
// -20

// soln: 


import java.util.*;
public class stack
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    String str ="12345*+-+";
	    
	    Stack<Integer> st = new Stack<>();
	    
	    for(char ch : str.toCharArray()){
	            if(Character.isDigit(ch)){
	                st.push(ch-'0');
	            }
	            else  {
	                int b=st.pop();
	                int a=st.pop();
	               
	               if(ch=='+'){
	                   st.push(a+b);
	               }
	               else if(ch=='-'){
	                   st.push(a-b);
	               }
	              else if(ch=='*'){
	                   st.push(a*b);
	               }
	                
	                
	                }
	            
	    }
	    System.out.print(st.pop());
		
		
	}
}
