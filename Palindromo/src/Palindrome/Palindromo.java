package Palindrome;
import java.util.*;
import java.nio.charset.*;
import static java.nio.charset.StandardCharsets.*;
import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;

public class Palindromo {
		
	public static void main(String[] args) throws UnsupportedEncodingException {
		    
		Scanner sc = new Scanner (System.in);
	    System.out.println("Introduce una palabra: ");
	    String new_text = sc.nextLine().toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú","u").replace(" ","").replace(".","").replace(",","");
	    
	    String reverse = "";
	        
	        for (int i = new_text.length() - 1; i >=0; --i) {
	
	        	reverse = reverse + new_text.charAt(i);
	             
	          }
	    
	        if (new_text.equals(reverse)) {
	       
	         System.out.println( new_text + " es palindromo\n");
	        }
	        else {
	         
	          System.out.println(new_text + " no es palindromo\n");
	        }
	        
	        
	      
	       
         }
	
}
