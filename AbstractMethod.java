package sem_exm;
abstract class Multiply {
    public abstract int multiplyTwo(int n1, int n2);
    public abstract int multiplyThree(int n1,int n2, int n3);
    public void show() {
        System.out.println("Method of abstract class");
    }
}
class AbstractMethod extends Multiply {
    @Override
    public int multiplyTwo(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int multiplyThree(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        AbstractMethod obj = new AbstractMethod();
        System.out.println("2 : " + obj.multiplyTwo(4,5));
        System.out.println("3 : " + obj.multiplyThree(4,5,7));
        obj.show();

    }


}
