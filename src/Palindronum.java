import java.util.Scanner;


public class Palindronum {
	
	public static String word;
	public static String newWord;
	public static String reversed = "";

	public static int length = 0;
	public static boolean palindrome = false;

	public static Scanner scanner;
	
	public static void init() {
		scanner = new Scanner(System.in);
	}
	
	public static String readLine() {
		return scanner.nextLine();
	}
	
	public static void shutdown() {
		scanner.close();
	}
	
	public static String reverse(String s) {
		for(int j = s.length() - 1; j >= 0; j--) {
			String temp = String.valueOf(s.charAt(j));
			reversed = reversed + temp;
		}
		return reversed;
	}
	
	public static boolean checkPalindrome(String w) {  
		int j = w.length() - 1;
		for(int i = 0; i <= (w.length() -1) / 2; i++) {
				String head = String.valueOf(w.charAt(i));
				String tail = String.valueOf(w.charAt(j));
				if(head.equalsIgnoreCase(tail)) {
					palindrome = true;
				} else {
					palindrome = false;
					return palindrome; 	//ask about this.
				}	
				j--;
		}
		return palindrome;
		
	}
	
	

	
	public static String find(String s) {   
		if(palindrome = true) {
			reverse(s);
			String newReversed = "";

					for(int x = 0; x < reversed.length() - 1; x++) {	
					String curr = String.valueOf(reversed.charAt(x));
					newReversed = newReversed + curr;
					}
					newWord = newReversed + s;			
		return newWord;
		}
		else 
			return s;		
		
	} 
	
	

	public static void main(String[] args) {
		
		init();
		
		System.out.println("Enter a string.");
		word = readLine();
		checkPalindrome(word);
		String str = Boolean.toString(palindrome);
		System.out.println(str);
		
		
		String s = find(word);
		System.out.println(s);
		System.out.println(s.length());

		shutdown();
		
	}

}
