package sem_exm;

//  Non Abstract method

abstract class AbstractSimple {
    void show() {
        System.out.println("Abstract method with concrete method");
    }
}

public class ATclass extends AbstractSimple {
    public static void main(String[] args) {
        ATclass obj = new ATclass();
        obj.show();
    }
}
