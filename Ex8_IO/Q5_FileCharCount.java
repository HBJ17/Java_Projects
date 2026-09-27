import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q5_FileCharCount {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // create a sample file first so the program is self-contained
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write("Hello, this is a sample text file for counting characters.".getBytes());
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
            return;
        }

        int count = 0;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.read() != -1) {
                count++;
            }
            System.out.println("Total number of characters: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
