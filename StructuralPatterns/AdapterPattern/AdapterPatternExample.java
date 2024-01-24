
 // Target interface representing the power outlet
interface PowerOutlet {
    void plugIntoOutlet();
}

// Adaptee interface representing an electronic device
interface ElectronicDevice {
    void plug();
}

// Concrete implementation of ElectronicDevice (Type A plug)
class TypeAPlugDevice implements ElectronicDevice {
    @Override
    public void plug() {
        System.out.println("Plugged in Type A device.");
    }
}

// Concrete implementation of ElectronicDevice (Type B plug)
class TypeBPlugDevice implements ElectronicDevice {
    @Override
    public void plug() {
        System.out.println("Plugged in Type B device.");
    }
}

// Adapter class implementing the PowerOutlet interface and wrapping an ElectronicDevice
class Adapter implements PowerOutlet {
    private ElectronicDevice electronicDevice;

    public Adapter(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void plugIntoOutlet() {
        electronicDevice.plug();
    }
}

// Client code
public class AdapterPatternExample {
    public static void main(String[] args) {
        // Existing power outlet (Target)
        PowerOutlet powerOutlet = new PowerOutlet() {
            @Override
            public void plugIntoOutlet() {
                System.out.println("Plugged into Type C power outlet.");
            }
        };

        // Electronic devices with different plug types (Clients)
        ElectronicDevice typeADevice = new TypeAPlugDevice();
        ElectronicDevice typeBDevice = new TypeBPlugDevice();

        // Adapting electronic devices to the power outlet
        Adapter adapterForTypeADevice = new Adapter(typeADevice);
        Adapter adapterForTypeBDevice = new Adapter(typeBDevice);

        // Plugging devices into the power outlet
        powerOutlet.plugIntoOutlet();              // Type C power outlet

        adapterForTypeADevice.plugIntoOutlet();    // Type A device plugged into Type C outlet
        adapterForTypeBDevice.plugIntoOutlet();    // Type B device plugged into Type C outlet
    }
}
