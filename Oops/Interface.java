// Interface 1
interface Vehicle {
    void start();
    void stop();

    default void service() {
        System.out.println("Vehicle needs servicing every 6 months.");
    }

    static void companyInfo() {
        System.out.println("Vehicle Company: Generic Motors");
    }
}

// Interface 2
interface Electric {
    void charge();

    default void batteryStatus() {
        System.out.println("Battery is at 80%");
    }
}

// Implementation Class
class Tesla implements Vehicle, Electric {
    public void start() {
        System.out.println("Tesla starts silently using electric power.");
    }

    public void stop() {
        System.out.println("Tesla stops with regenerative braking.");
    }

    public void charge() {
        System.out.println("Tesla is charging at the supercharger station.");
    }

    // Optional: Override default method
    @Override
    public void service() {
        System.out.println("Tesla requires software updates and battery checkups.");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Tesla car = new Tesla();

        car.start();          // from Vehicle
        car.charge();         // from Electric
        car.batteryStatus();  // default from Electric
        car.service();        // overridden from Vehicle
        car.stop();           // from Vehicle

        Vehicle.companyInfo(); // static method from Vehicle interface
    }
}
