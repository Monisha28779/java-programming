import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstLine {
    public static void main(String[] args) {
        String fileName = "sample.txt";   // You can change this to any file name

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);

            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }
        catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }
}
