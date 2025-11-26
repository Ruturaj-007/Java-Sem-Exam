package sem_exm.enumerations.filehandling_05;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderBasics {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("note.txt")) {

            int ch; // read until end of the file
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        }   catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
        }

    }
}
