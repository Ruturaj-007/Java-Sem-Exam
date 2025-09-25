package sem_exm;

public class Constructor_Overloading {
    int a, b, c;
    public Constructor_Overloading() {
         a = 10;
         b = 20;
    }

    public Constructor_Overloading(int i, int j) {
        a  = i; b = j;
    }

    public Constructor_Overloading(int i, int j, int k) {
        a  = i; b = j; c = k;
    }

    public static void main(String[] args) {
        Constructor_Overloading s1 = new Constructor_Overloading();
        Constructor_Overloading s2 = new Constructor_Overloading(1,2);
        Constructor_Overloading s3 = new Constructor_Overloading(11,22,33);

    }
}
