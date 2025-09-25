package sem_exm;
class ABC {
    int x=30;
}
public class DeepCopy {
    public static void main(String[] args) {
        ABC obj1 = new ABC();
        ABC obj2 = new ABC();  // new object created
        obj2.x = 6;
        System.out.println("obj1.x = " + obj1.x); // prints 30
    }
}
