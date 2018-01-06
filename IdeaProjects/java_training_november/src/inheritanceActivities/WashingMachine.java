package inheritanceActivities;

/**
 * Created by igorsandler on 1/5/18.
 */
public class WashingMachine extends Machine {
    @Override
    public void start() {
        System.out.println("Washing Machine Started");
    }
    @Override
    public void stop() {
        System.out.println("Washing Machine Stopped");

    }
    public void temp() {
        System.out.println("Washing machine running at cold temp");

    }

}
