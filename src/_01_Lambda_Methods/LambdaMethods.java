package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		StringBuilder string = new StringBuilder("characters");
		
		
		
		printCustomMessage((s)->{
			System.out.println(s);
		}, string.reverse().toString());
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		String chars = "characters";
		
		StringBuilder mixedCase = new StringBuilder();
		
		for(int i = 0; i<chars.length();i++) {
			if(i%2==0) {
				mixedCase.append(Character.toUpperCase(chars.charAt(i)));
			}
			else {
				mixedCase.append(Character.toLowerCase(chars.charAt(i)));
			}
		}
		
		printCustomMessage((s)->{
			System.out.println(s);
		},mixedCase.toString());
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		StringBuilder periods = new StringBuilder();
		
		for(int i = 0; i<chars.length();i++) {
			periods.append(chars.charAt(i));
			periods.append('.');
		}
		
		printCustomMessage((s)->{
			System.out.println(s);
		},periods.toString());
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		StringBuilder noVowels = new StringBuilder();
		
		for(int i = 0;i<chars.length();i++) {
			if(chars.charAt(i)=='a'||chars.charAt(i)=='e'||chars.charAt(i)=='i'||chars.charAt(i)=='o'||chars.charAt(i)=='u') {
				
				
			}
			else {
				noVowels.append(chars.charAt(i));
			}
		}
		
		printCustomMessage((s)->{
			System.out.println(s);
		},noVowels.toString());
	
	}
	
	
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
