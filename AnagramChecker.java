import java.util.Scanner;

public class AnagramChecker {


    public static boolean areAnagrams(String str1, String str2) {
       
        if (str1.length() != str2.length()) {
            return false;
        }

        
        int[] charCount = new int[256]; 
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take two strings as input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams and print the result
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + result);

        // Close the scanner
        scanner.close();
    }
}
