package sem_exm;

interface A2p {
    void show();
}

public class InterfaceD implements A2p {
    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        InterfaceD obj = new InterfaceD();
        obj.show();
    }
}
