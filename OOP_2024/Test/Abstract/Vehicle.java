/**
 * Abstract class representing a generic Vehicle.
 * Holds information such as brand, model, registration number, and owner.
 */
public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructs a new Vehicle with specified attributes.
     *
     * @param brand               the brand of the vehicle
     * @param model               the model of the vehicle
     * @param registrationNumber  the registration number of the vehicle
     * @param owner               the owner of the vehicle
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Gets the vehicle's brand.
     *
     * @return the brand of the vehicle
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the vehicle's brand.
     *
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the vehicle's model.
     *
     * @return the model of the vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the vehicle's model.
     *
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the registration number of the vehicle.
     *
     * @return the registration number of the vehicle
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the registration number of the vehicle.
     *
     * @param registrationNumber the registration number to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Gets the owner of the vehicle.
     *
     * @return the owner of the vehicle
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Sets the owner of the vehicle.
     *
     * @param owner the owner to set
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * Transfers ownership of the vehicle to a new owner.
     *
     * @param newOwner the new owner of the vehicle
     */
    public void transferOwnership(Person newOwner) {
        if (this.owner != null) {
            this.owner.removeVehicle(this.registrationNumber);
        }
        newOwner.addVehicle(this);
        this.owner = newOwner;
    }

    /**
     * Gets the vehicle information.
     *
     * @return the vehicle information
     */
    public abstract String getInfo();
}
