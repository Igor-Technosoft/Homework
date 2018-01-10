package polymorphismHomework;

/**
 * Created by igorsandler on 1/10/18.
 */
class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String brand() {
        return "No car brand set";
    }

    public String getName() {
        return name;
    }
}

class Peugeout extends Vehicle {
        public Peugeout() {
            super("Peugeout");
        }

        @Override
        public String brand() {
            return "This is a French car";
        }

    }

class RangeRover extends Vehicle {
        public RangeRover() {
            super("Range Rover");
        }

        @Override
        public String brand() {
            return "This is a British car";

        }

    }


class Lada extends Vehicle {
        public Lada() {
            super("This is a Russian car");
        }

        @Override
        public String brand() {
            return "This is a Russian car";
        }
    }


    public class NewPolymorphism {
        public static void main(String[] args) {
            for (int i = 1; i < 10; i++) {
                Vehicle vehicle = randomVehicle();
                System.out.println("Car #" + i + ":" + vehicle.getName() + "\n" + "Brand: " + vehicle.brand() + "\n");


            }
        }
        private static Vehicle randomVehicle() {
            int randomNumber = (int) (Math.random() * 3) + 1;
            System.out.println("Random Number Generated was: + " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new Peugeout();
                case 2:
                    return new RangeRover();
                case 3:
                    return new Lada();
            }
            return null;
        }
    }


