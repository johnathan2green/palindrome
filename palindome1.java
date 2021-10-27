package palindrome;
import java.util.Scanner;

public class palindome1 {

		private static Scanner input;

		public static void main(String args[]){  
			  int r,sum=0,temp;    
			  input = null;
			int n= input.nextInt();
			
			
			  temp=n;    
			  while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("This is a palindrome number ");    
			  else    
			   System.out.println("This is not a palindrome");    
			}  
			}  
		
	


