package sem_exm.enumerations.exceptionhandling_04;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // ArithmeticException

            int arr[] = new int[3];
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        }

        catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by zero!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid!");
        }

        catch (Exception e) {
            System.out.println("Some other exception occurred!");
        }

        System.out.println("Program continues after handling exceptions...");
        }
    }

