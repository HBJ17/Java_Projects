import java.io.*;

public class Q6_LogMonitoring {
    public static void main(String[] args) {
        String logFile = "app.log";
        String outputFile = "filtered_log.txt";

        // create a sample log file so the program is self-contained
        String sampleLog = "2025-08-13 09:10:01 INFO Server started successfully\n" +
                "2025-08-13 09:12:45 WARNING Disk space running low\n" +
                "2025-08-13 09:15:30 INFO User admin logged in\n" +
                "2025-08-13 09:20:00 ERROR Database connection failed\n";

        try (FileWriter fw = new FileWriter(logFile)) {
            fw.write(sampleLog);
        } catch (IOException e) {
            System.out.println("Error creating log file: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR") || line.contains("WARNING")) {
                    String keyword = line.contains("ERROR") ? "ERROR" : "WARNING";
                    String entry = keyword + ": " + line.substring(line.indexOf(keyword) + keyword.length() + 1);
                    System.out.println(entry);
                    writer.write(entry);
                    writer.newLine();
                }
            }
            System.out.println("Filtered entries written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing log file: " + e.getMessage());
        }
    }
}
