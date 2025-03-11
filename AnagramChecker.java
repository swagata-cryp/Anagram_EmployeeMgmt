import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two strings are anagrams using frequency counting
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to store frequency of each character
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Subtract the frequency of characters from the second string
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // If all counts are zero, the strings are anagrams
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
