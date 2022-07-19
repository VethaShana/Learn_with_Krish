public class CarSteering {
    private String steeringSize;
    private volatile static CarSteering uniqueInstance  = new CarSteering();

    private CarSteering() {
        steeringSize = "Big";
    }

    public static CarSteering getUniqueInstance() {
        if (uniqueInstance == null) {
             synchronized (CarSteering.class) {
                 if (uniqueInstance == null) {
                     uniqueInstance = new CarSteering();
                 }
             }

        }
        return uniqueInstance;
    }
}