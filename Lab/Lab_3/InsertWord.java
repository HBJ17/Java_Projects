import java.util.Scanner;

public class InsertWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to insert: ");
        String word = sc.nextLine();
        System.out.print("Enter the index to insert the word: ");
        int index = sc.nextInt();
        String result1 = sentence.substring(0, index) + word + sentence.substring(index);
        System.out.println("Using substring(): " + result1);
        StringBuffer sb = new StringBuffer(sentence);
        sb.insert(index, word);
        System.out.println("Using StringBuffer.insert(): " + sb);
        sc.close();
    }
}