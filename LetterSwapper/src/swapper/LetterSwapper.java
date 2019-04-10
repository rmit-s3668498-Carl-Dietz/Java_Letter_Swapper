/**
* Small program that swaps two characters in a given string. Useful for simple substitution ciphers.
* 
* Used for Assignment One of COSC2536, Security in Computing & IT at RMIT
*
* @author Carl Dietz s3668498 2019
*/
package swapper;

import java.util.Scanner;

public class LetterSwapper 
{
	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
	    System.out.println("Enter passage (or nothing to exit)");
	    String passage = stdin.nextLine();
	    checkExit(passage, stdin);
		while(true)
		{
		    System.out.println("Replace:");
		    
		    String oldChar = stdin.nextLine();
		    checkExit(oldChar, stdin);
		    
		    System.out.println("With:");
		    
		    String newChar = stdin.nextLine();
		    checkExit(newChar, stdin);
		    
		    passage = swap(passage, oldChar.charAt(0), newChar.charAt(0));
		    
		   System.out.println(passage);
		}
	}
	
	private static String swap(String s, char c1, char c2)
	{
		//Convert string into char array
		char[] chars = s.toCharArray();		
		
		//Iterate through and run comparisons and swap if needed
		for(int i = 0; i < chars.length; i++)
		{
			if(chars[i] == c1)
			{
				chars[i] = c2;
			}
			else if(chars[i] == c2)
			{
				chars[i] = c1;
			}
		}
		
		return new String(chars);
	}
	
	private static void checkExit(String s, Scanner stdin)
	{
		if(s.equals(""))
		{
			System.out.println("End Of Line");
			System.exit(0);
		}
	}
}


