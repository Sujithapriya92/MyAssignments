package week1.day2;

public class PalindromeChecker {

	public static void main(String[] args) {
        int n = 132; 
        int reversed = 0;
        int original = n; 

        for (int i = n; i > 0; i = i / 10) {
            reversed = reversed * 10 + i % 10;  
        }

        if (original == reversed) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

	}

}
