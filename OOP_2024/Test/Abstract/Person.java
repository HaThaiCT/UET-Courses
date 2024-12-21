import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * Constructs a new Person with specified name and address.
     *
     * @param name    the name of the person
     * @param address the address of the person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Gets the person's name.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the person's address.
     *
     * @return the address of the person
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the person's address.
     *
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Adds a vehicle to the person's vehicle list.
     *
     * @param vehicle the vehicle to add
     */
    public void addVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicleList) {
            if (v.equals(vehicle)) {
                return;
            }
        }
        vehicleList.add(vehicle);
    }

    /**
     * Removes a vehicle from the person's vehicle list by registration number.
     *
     * @param registrationNumber the registration number of the vehicle to remove
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * Gets information of all vehicles owned by the person.
     *
     * @return a formatted string of all vehicle information or a message if no vehicle is owned
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return String.format("%s has no vehicle!", name);
        } else {
            StringBuilder info = new StringBuilder(name + " has:\n\n");
            for (Vehicle vehicle : vehicleList) {
                info.append(vehicle.getInfo()).append("\n");
            }
            return info.toString().trim();
        }
    }
}
