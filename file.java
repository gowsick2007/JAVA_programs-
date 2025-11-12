import java.io.*;
public class file {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\GOWSICK\\txt"));
        writer.write("This is buffered writing in Java.");
        writer.newLine();  // Adds a new line
        writer.write("Second line.");
        writer.close();

        System.out.println("Data written successfully.");
    }
}

