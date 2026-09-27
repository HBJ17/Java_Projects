public class Q3_InsertWord {
    public static void main(String[] args) {
        String sentence = "The quick fox jumps.";
        String wordToInsert = "brown";
        int position = 10; // insert right before "fox"

        // Method 1: split and manually combine substrings
        String part1 = sentence.substring(0, position);
        String part2 = sentence.substring(position);
        String manualResult = part1 + wordToInsert + " " + part2;
        System.out.println("Manual insertion: " + manualResult);

        // Method 2: using StringBuffer.insert()
        StringBuffer sb = new StringBuffer(sentence);
        sb.insert(position, wordToInsert + " ");
        System.out.println("StringBuffer insertion: " + sb.toString());
    }
}
