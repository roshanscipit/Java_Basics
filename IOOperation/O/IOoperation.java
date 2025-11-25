package IOOperation.O;
import java.io.File;
import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;

public class IOoperation {
    public static void main(String[] args) {
        // File operations example
        File file = new File("example.txt");
        try {
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileOutputStream fos = new FileOutputStream(file);
            String data = "Hello, World!";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to the file.");

            // Read from the file
            FileInputStream fis = new FileInputStream(file);
            int content;
            System.out.print("File content: ");
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}