import java.io.BufferedReader;
import java.io.FileReader;

class book {
    protected String isbn;
    protected String title;

    book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}

class LibraryBook extends book {
    private String author;
    private int issuedDays;

    public LibraryBook(String isbn, String title, String author, int issuedDays) {
        super(isbn,title);
        this.author = author;
        this.issuedDays = issuedDays;
    }

    public Boolean TitleCheck() {
        return title.trim().endsWith("Guide");
    }

    public int CalculateFine() {
        if(issuedDays > 14) {
            return (issuedDays - 14)*5;
        }
        return 0;
    }

    public void displayDetails() {
        System.out.println("     Library Book Record     ");
        System.out.println("ISBN         : " + isbn);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Issued Days  : " + issuedDays);
        System.out.println("Title ends with 'Guide'? : " + (TitleCheck() ? "Yes" : "No"));
        double fine = CalculateFine();
        System.out.printf("Fine Amount  : ₹%.2f%n", fine);
    }
}

public class Library_management {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Lab\\Skill_Assess\\Files\\book.txt"))) {
            String isbn = br.readLine().trim();
            String title = br.readLine().trim();
            String author = br.readLine().trim();
            int issuedDays = Integer.parseInt(br.readLine().trim());

            LibraryBook book = new LibraryBook(isbn, title, author, issuedDays);
            book.displayDetails();

        } catch (Exception e) {
            System.out.println("Error reading library file: " + e.getMessage());
        }
    }
}
