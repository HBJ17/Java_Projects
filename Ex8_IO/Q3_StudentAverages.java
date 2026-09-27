import java.io.*;

public class Q3_StudentAverages {
    public static void main(String[] args) throws Exception {
        String data = "101,85,90,78\n102,88,76,92\n103,79,85,80";
        CharArrayReader charReader = new CharArrayReader(data.toCharArray());
        BufferedReader reader = new BufferedReader(charReader);

        StringWriter stringWriter = new StringWriter();
        BufferedWriter writer = new BufferedWriter(stringWriter);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            String studentId = fields[0];
            int sum = 0;
            for (int i = 1; i < fields.length; i++) {
                sum += Integer.parseInt(fields[i]);
            }
            double average = sum / (double) (fields.length - 1);
            String output = String.format("Student %s: Average Score = %.2f", studentId, average);
            System.out.println(output);
            writer.write(output);
            writer.newLine();
        }

        writer.flush();
        System.out.println("\n--- Stored output ---\n" + stringWriter.toString());

        reader.close();
        writer.close();
    }
}
