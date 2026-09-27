interface LibraryMember {
    void issueBook();
}

interface StudentMember extends LibraryMember {
    double calculateFine();
}

interface FacultyMember extends LibraryMember {
    int displayBorrowLimit();
}

class ResearchScholar implements StudentMember, FacultyMember {
    private int overdueDays;

    public ResearchScholar(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    @Override
    public void issueBook() {
        System.out.println("Book issued to Research Scholar.");
    }

    @Override
    public double calculateFine() {
        return overdueDays * 2.0; // Rs.2 per overdue day
    }

    @Override
    public int displayBorrowLimit() {
        return 10; // research scholars can borrow up to 10 books
    }
}

public class Q7_LibraryMember {
    public static void main(String[] args) {
        ResearchScholar rs = new ResearchScholar(5);
        rs.issueBook();
        System.out.println("Borrow Limit: " + rs.displayBorrowLimit());
        System.out.println("Fine Amount: " + rs.calculateFine());
    }
}
