import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second word: ");
        String str2 = sc.nextLine().toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Manual Method: Not Anagrams");
        } else {
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];
            for (int i = 0; i < str1.length(); i++) {
                freq1[str1.charAt(i) - 'a']++;
                freq2[str2.charAt(i) - 'a']++;
            }
            boolean isAnagram = true;
            for (int i = 0; i < 26; i++) {
                if (freq1[i] != freq2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram)
                System.out.println("Manual Method: Anagrams");
            else
                System.out.println("Manual Method: Not Anagrams");
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2))
            System.out.println("Using Arrays.sort(): Anagrams");
        else
            System.out.println("Using Arrays.sort(): Not Anagrams");
        sc.close();
    }
}