package PracExcer2;
import java.io.*; 

public class Q7 {
    public static void main(String[] args) throws IOException {
        // Create a file
        File file = new File("example.txt");
        boolean created = false;
		try {
			created = file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (created) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Write to a file
        FileWriter writer = null;
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        writer.write("Hello, world!");
        writer.close();
        System.out.println("Successfully wrote to the file.");

        // Read from a file
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        System.out.println("Successfully read from the file.");

        // Update a file
        FileWriter writer2 = new FileWriter(file);
        writer2.write("Hello, world! This is an update.");
        writer2.close();
        System.out.println("Successfully updated the file.");

        // Delete a file
        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
