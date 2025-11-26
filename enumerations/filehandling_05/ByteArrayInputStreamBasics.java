package sem_exm.enumerations.filehandling_05;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamBasics {
    public static void main(String[] args) {
        // Step 1: Create a string
        String tmp = "hello this is a byte array input stream";

        // Step 2: Convert the string into a byte array
        // getBytes() method converts each character of the string into a corresponding byte
        byte b[] = tmp.getBytes();

        // Step 3: Create a ByteArrayInputStream object using the byte array
        // This allows reading the data in the byte array as an input stream
        ByteArrayInputStream input = new ByteArrayInputStream(b);

        int c; // variable to store the byte read from the stream

        // Step 4: Read bytes from the stream until the end (-1 indicates end of stream)
        while ((c = input.read()) != -1) {
            // Convert byte to char and print
            System.out.print((char) c);
        }

        // Optional: close the stream (not strictly necessary for ByteArrayInputStream)
    }
}
