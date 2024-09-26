package scannerclass;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        
        scanner.close();

	}

}