public class Car extends Vehicle {

    private int numberOfDoors;

    /**
     * Constructs a new Car with specified attributes.
     *
     * @param brand              the brand of the car
     * @param model              the model of the car
     * @param registrationNumber the registration number of the car
     * @param owner              the owner of the car
     * @param numberOfDoors      the number of doors in the car
     */
    public Car(String brand, String model,
     String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Gets the number of doors of the car.
     *
     * @return the number of doors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Sets the number of doors of the car.
     *
     * @param numberOfDoors the number of doors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car:\n\tBrand: " + brand 
        + "\n\tModel: " + model 
        + "\n\tRegistration Number: " + registrationNumber 
        + "\n\tNumber of Doors: " + numberOfDoors 
        + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }
}
