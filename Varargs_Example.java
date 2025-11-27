package sem_exm;

public class Varargs_Example {
    static void sum(int... numbers){
        int total = 0;
        for (int ele : numbers) {
            total+=ele;
        }
            System.out.println("Sum is : " + total);
    }

    public static void main(String[] args) {
        sum(1,2);
        sum(11,11);
        sum();
    }
}
