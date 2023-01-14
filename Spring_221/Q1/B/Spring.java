package Spring_221.Q1.B;

public class Spring {
    public static void main(String[] args) {
        Vehicle cng=new Vehicle() {
            @Override
            public void fuelType() {
                System.out.println("Use LPG");
            }
        };
        Vehicle airPlane=new Vehicle() {
            @Override
            public void fuelType() {
                System.out.println("Use jet fuel");
            }
        };
        cng.fuelType();
        airPlane.fuelType();
    }
}
