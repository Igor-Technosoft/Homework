package inheritanceHomework;

/**
 * Created by igorsandler on 1/9/18.
 */
public class Car {
    private String type;
    private String typeOfSteering;
    private int numberOfGears;
    private String typeOfTransmission;
    private String typeOfMotor;
    private String typeOfSafety;
    private int weight;
    private String fuelType;

    public Car (String type, String typeOfSteering,int numberOfGears, String typeOfTransmission,String typeOfMotor,
                String typeOfSafety,int weight,String fuelType) {
        this.type = type;
        this.typeOfSteering = typeOfSteering;
        this.numberOfGears = numberOfGears;
        this.typeOfTransmission = typeOfTransmission;
        this.typeOfMotor = typeOfMotor;
        this.typeOfSafety = typeOfSafety;
        this.weight = weight;
        this.fuelType = fuelType;
    }


    public void typeOfVehicle(){
        System.out.println("Car.typeOfVehicle() called" + "\n");
        System.out.println("Each car must have a type "+ "\n");

    }

    public void motor() {
        System.out.println("Each car has a motor" + " " );

    }
    public void steering() {
        System.out.println("Car.Steering() is called as each car must be able to steer" + "\n");
    }

    public void transmission() {
        System.out.println("Car.Transmission() is called as each car must have a transmission" + "\n");

    }
    public void maxSpeed(int speed) {
        System.out.println("Car.maxSpeed() is called as most cars are capable of achieving " + " " + speed + " " +
                "MPH");
    }

}
