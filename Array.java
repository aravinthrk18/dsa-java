import java.util.*;
public class Array
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int arr[]={10, 20,5,8,15};
            int slar=Integer.MIN_VALUE;
            int lar=Integer.MIN_VALUE;
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]>lar){
                    slar=lar;
                    lar=arr[i];
                }
                
                else if(arr[i]>slar && arr[i]!=lar){
                    slar=arr[i];
                }
                
                
                
            }
            System.out.print(slar);
        }
	
}
