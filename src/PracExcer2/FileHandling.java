
package PracExcer2;
import java.io.*;

public class FileHandling {

    public static void main(String[] args) {
        // specify the file name and path
        String fileName = "example.txt";

        // write to file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // read from file
        try {
            FileReader reader = new FileReader(fileName);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
            System.out.println("\nSuccessfully read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        // append to file
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("\nThis text will be appended to the file.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
