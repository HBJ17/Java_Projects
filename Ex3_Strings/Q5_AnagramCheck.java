import java.util.Arrays;

public class Q5_AnagramCheck {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        // Method 1: manual character frequency counting
        boolean manualResult = isAnagramManual(word1, word2);
        System.out.println("Anagram (manual frequency count): " + manualResult);

        // Method 2: sort characters and compare
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean sortedResult = Arrays.equals(arr1, arr2);
        System.out.println("Anagram (sorted comparison): " + sortedResult);
    }

    static boolean isAnagramManual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for (char c : s1.toCharArray()) freq[c]++;
        for (char c : s2.toCharArray()) freq[c]--;
        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }
}
