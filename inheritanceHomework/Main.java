package inheritanceHomework;

import com.sun.xml.internal.ws.util.NoCloseInputStream;

/**
 * Created by igorsandler on 1/10/18.
 */
public class Main {
    public static void main(String[] args) {
        NissanSuv myNissanSuv = new NissanSuv("Automobile","PowerSteering",5,
                "Automatic","Gas Motor","Airbags",
                1000,"Unleaded");

        myNissanSuv.typeOfVehicle();
        myNissanSuv.steering();
        myNissanSuv.motor();
        myNissanSuv.transmission();
        myNissanSuv.maxSpeed(100);

    }
}
