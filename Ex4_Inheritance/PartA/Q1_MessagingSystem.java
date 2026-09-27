class Message {
    protected String content;

    public Message(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Message: " + content);
    }
}

class EmailMessage extends Message {
    private String subjectLine;

    public EmailMessage(String content, String subjectLine) {
        super(content);
        this.subjectLine = subjectLine;
    }

    public void displayEmail() {
        System.out.println("Subject: " + subjectLine);
        System.out.println("Body: " + content);
    }
}

public class Q1_MessagingSystem {
    public static void main(String[] args) {
        EmailMessage email = new EmailMessage("Meeting rescheduled to 5 PM.", "Schedule Update");
        email.displayEmail();
    }
}
