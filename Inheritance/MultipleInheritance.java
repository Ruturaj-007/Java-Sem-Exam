package sem_exm.Inheritance;
interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a land vehicle");
    }
}
interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a water vehicle");
    }
}
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    AmphibiousVehicle() {
        System.out.println("This is a amphibious vehicle");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.landInfo();
        obj.waterInfo();
    }
}
