package sem_exm;


public class RecursionExample {
static int count = 0;
    static void P() {
        count++;
        if(count<=5) {
            System.out.println("Hello : " + count);
            P();
        }
    }
    public static void main(String[] args) {
        P();
    }
}
