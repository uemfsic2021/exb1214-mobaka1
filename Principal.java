public class Principal
{
	public static void main(String[]args)
  {
	
		if ( args.length == 1 )
		{
			String s = args[0] ; // args[0] correspond a l'argument 2 de la commande java
		
			boolean isPalindrome = Palindrome.is_palindrome(s) ;
		
			System.out.println ("----------------------------------------------------");
			System.out.println("Input : " + s + " >>> Output : " + isPalindrome );		
			System.out.println("----------------------------------------------------");		
		}
  }
}
