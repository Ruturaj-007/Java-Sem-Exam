package sem_exm;

public class StaticVariableExample {
    static int count = 0;

    StaticVariableExample (){
        count++;
    }
    public static void main(String[] args) {
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        System.out.println("No of objects Created : " + StaticVariableExample.count);
    }
}
