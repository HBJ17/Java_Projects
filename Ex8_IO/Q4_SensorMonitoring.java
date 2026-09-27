import java.io.*;

public class Q4_SensorMonitoring {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);

        // simulate 3 sensor readings: id(int), temp(float), pressure(float), humidity(float)
        writeReading(dos, 1, 42.5f, 1.05f, 65.0f);
        writeReading(dos, 2, 35.0f, 1.10f, 55.0f);
        writeReading(dos, 3, 38.0f, 1.09f, 58.0f);

        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(baos.toByteArray()));

        while (dis.available() > 0) {
            int id = dis.readInt();
            float temp = dis.readFloat();
            float pressure = dis.readFloat();
            float humidity = dis.readFloat();

            System.out.printf("Sensor %d -> Temp:%.1f Pressure:%.2f Humidity:%.1f%n", id, temp, pressure, humidity);

            if (temp > 40.0) System.out.println("  WARNING: High temperature!");
            if (pressure > 1.08) System.out.println("  WARNING: High pressure!");
            if (humidity > 62.0) System.out.println("  WARNING: High humidity!");
        }

        dos.close();
        dis.close();
    }

    static void writeReading(DataOutputStream dos, int id, float temp, float pressure, float humidity) throws IOException {
        dos.writeInt(id);
        dos.writeFloat(temp);
        dos.writeFloat(pressure);
        dos.writeFloat(humidity);
    }
}
