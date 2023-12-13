/*Design a program that reads data from a file using the FileReader class. 
Use a BufferedReader to handle IOException*/ 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Provide the path to the file you want to read
        String filePath = "path/to/your/file.txt";

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            // Read each line from the file and print it
            System.out.println("Contents of the file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle IOException, e.g., file not found or unable to read
            e.printStackTrace();
        }
    }
}


