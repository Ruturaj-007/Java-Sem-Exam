package sem_exm.enumerations.exceptionhandling_04;

public class ArithmeticExceptionExp {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println("Access element three : " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            System.out.println("Always executes");
        }

    }
}
