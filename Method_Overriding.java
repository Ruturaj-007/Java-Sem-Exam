package sem_exm;

// Method Overriding / Run-Time Polymorphisms

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}
class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 5;
    }
}

class ICCI extends Bank {
    @Override
    int getRateOfInterest() {
        return 11;
    }
}

class AXIS extends Bank {
    @Override
    int getRateOfInterest() {
        return 9;
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICCI I = new ICCI();
        AXIS A = new AXIS();

        System.out.println(I.getRateOfInterest());
        System.out.println(s.getRateOfInterest());
        System.out.println(A.getRateOfInterest());
    }
}
