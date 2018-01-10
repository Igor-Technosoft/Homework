package inheritanceHomework;

/**
 * Created by igorsandler on 1/10/18.
 */
public class NissanSuv extends Car {

    private double wheelBaseClearance;
    private String drivingMode;
    private double roofCapacity;
    private int seatCapacity;

    public NissanSuv(String type, String typeOfSteering, int numberOfGears, String typeOfTransmission, String
            typeOfMotor, String typeOfSafety, int weight, String fuelType) {

        super (type,typeOfSteering,numberOfGears,typeOfTransmission,typeOfMotor,typeOfSafety,weight,"Gas");
        this.wheelBaseClearance = wheelBaseClearance;
        this.drivingMode = drivingMode;
        this.roofCapacity = roofCapacity;
        this.seatCapacity = seatCapacity;

    }

private void nissanSuvSpecifications () {
        wheelBaseClearance = 18.45;
        drivingMode = "All Wheel Drive";
        roofCapacity = 145.55;
        seatCapacity = 8;

    System.out.println("This SUV has a " + wheelBaseClearance + " " + "clearance");
    System.out.println("This SUV is an " + drivingMode + " " + "machine");
    System.out.println("This SUV has a " + roofCapacity + " " + "roof capacity");
    System.out.println("This SUV has a " + seatCapacity + " " + "seat capacity" + "\n");
}
@Override
    public void typeOfVehicle() {
    System.out.println("NissanSuv.typeofVehicle() is called");
    super.typeOfVehicle();
    System.out.println("This automobile is an SUV");
    nissanSuvSpecifications();
}
@Override
    public void motor() {
    System.out.println("NissanSuv.Motor() called");
    super.motor();
    System.out.println("This Nissan SUV has a 4.5 L Motor" + "\n");

}
@Override
    public void steering() {
    System.out.println("NissanSUV.Steering called ");
    super.steering();
    System.out.println("This Nissan SUV has a special steering package" + "\n");

}
@Override
    public void transmission() {
    System.out.println("NissanSUV.Steering called");
    super.transmission();
    System.out.println("This Nissan SUV has Automatic Overdrive Transmission" +"\n");

}
@Override
    public void maxSpeed(int speed) {
    System.out.println("MissanSUV.Steering called");
    super.maxSpeed(100);
    System.out.println("This Nissan SUV can achieve 140 MPH");



}
}



