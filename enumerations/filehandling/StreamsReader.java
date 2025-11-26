package sem_exm.enumerations.filehandling;

import java.io.InputStreamReader;
import java.io.IOException;

public class StreamsBasics {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in)) { // Converts keyboard input bytes --> characters
            System.out.println("Enter some letters: ");

            int ch;
            // isr.read() waits for input Reads one character at a time and returns its ASCII value
            while ((ch = isr.read()) != '\n') { // Loop continues until user presses Enter ('\n' = newline)
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
