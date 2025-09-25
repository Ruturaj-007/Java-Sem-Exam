package sem_exm;

class ABCD {
    int x = 36;
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        ABCD obj = new ABCD();
        ABCD obj2 = obj;
        obj2.x = 5;
        System.out.println("Obj.x =  " + obj.x);
    }
}
