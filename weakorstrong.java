import java.util.*;
public class weakorstrong
{
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str ="Zoho@123";
        boolean hasDigit=false;
        boolean hasSpcl=false;
        boolean hasLower=false;
        boolean hasUpper=false;
        
        
        if(str.length()>=8){
            for(int i=0;i<str.length();i++){
                
                char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpper=true;
            }
           else if(Character.isLowerCase(ch)){
                hasLower=true;
            }
          else  if(Character.isDigit(ch)){
                hasDigit=true;
            }
            else{
                hasSpcl=true;
            }
                    
                        }
                        
                        
                    if(hasUpper && hasLower && hasDigit && hasSpcl){
                        System.out.print("Strong Passowrd");
                    }
                    else{
                        System.out.print("Weak PassWprd");
                    }
        }
        
       
	}
	
	
}