public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * Constructs a new MotorBike with specified attributes.
     *
     * @param brand              the brand of the motorbike
     * @param model              the model of the motorbike
     * @param registrationNumber the registration number of the motorbike
     * @param owner              the owner of the motorbike
     * @param hasSidecar         indicates if the motorbike has a sidecar
     */
    public MotorBike(String brand, String model, 
    String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Checks if the motorbike has a sidecar.
     *
     * @return true if the motorbike has a sidecar, false otherwise
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Sets the sidecar status of the motorbike.
     *
     * @param hasSidecar the sidecar status to set
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return "Motor Bike:\n\tBrand: " + brand 
        + "\n\tModel: " + model 
        + "\n\tRegistration Number: " + registrationNumber 
        + "\n\tHas Side Car: " + hasSidecar 
        + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }
}
