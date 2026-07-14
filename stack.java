

// // Given a numeric string followed by arithmetic operators, evaluate the expression according to the
// // specified rules.
// // Sample Input
// // 12345*+-+
// // Sample Output
// // -20

// // soln: 


import java.util.*;
// public class stack
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
		
// 	    String str ="12345*+-+";
	    
// 	    Stack<Integer> st = new Stack<>();
	    
// 	    for(char ch : str.toCharArray()){
// 	            if(Character.isDigit(ch)){
// 	                st.push(ch-'0');
// 	            }
// 	            else  {
// 	                int b=st.pop();
// 	                int a=st.pop();
	               
// 	               if(ch=='+'){
// 	                   st.push(a+b);
// 	               }
// 	               else if(ch=='-'){
// 	                   st.push(a-b);
// 	               }
// 	              else if(ch=='*'){
// 	                   st.push(a*b);
// 	               }
	                
	                
// 	                }
	            
// 	    }
// 	    System.out.print(st.pop());
		
		
// 	}
// }
// Replace every array element with the smallest greater element on its right. If none exists, replace it
// with -1.
// Sample Input
// 2 -1 0 -1 3
// Sample Output
// 3 0 3 3 -1


public class stack
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int arr[]={2 ,-1 ,0 ,-1 ,3};
        int res[]=new int[arr.length];
        Arrays.fill(res ,-1);
        
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int top=st.pop();
                
                res[top]=arr[i];
                
                
            }
            
            st.push(i);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
		
	}
}