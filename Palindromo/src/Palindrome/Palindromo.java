package Palindrome;

import java.util.Scanner;

public class Palindromo {
		
	public static void main(String[] args)  {
		    
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		
		String letter = sc.nextLine().toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú","u").replace(" ","").replace(".","").replace(",","");
		
		String reverse = "";
		
		for(int i=letter.length() - 1; i >=0; i--) {
			
			reverse = reverse + letter.charAt(i);
		}
		
			if(letter.equals(reverse)) {
				System.out.println(letter + "es palindromo\n");
			}else {
				System.out.println(letter + "no es palindromo");
			}	
		}
}
