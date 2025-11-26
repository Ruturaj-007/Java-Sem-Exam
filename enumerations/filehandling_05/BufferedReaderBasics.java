package sem_exm.enumerations.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderBasics {                 // Reads text efficiently by buffering characters
    public static void main(String[] args) {
        // Reading from console (Keyboard Input)
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { // Converts raw byte stream into character stream
            System.out.println("Enter text : ");    // Prompt user
            System.out.println("You typed : " + br.readLine()); //  reads one complete line of text from keyboard
        }
        catch (IOException e) {
            System.out.println("Error reading the message : " + e.getMessage());
        }

        // Reading from file
        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
            String line; // Wraps the FileReader to read text efficiently (line by line)
            while ((line = br.readLine()) != null) { // Reads one line from the file
                System.out.println(line);            // Assigns that line to the variable line
            }                                        // Checks if the line is NOT null (null means end of file)
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
