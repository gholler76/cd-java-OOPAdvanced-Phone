public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();

    // getters and setters removed for brevity. Please implement them yourself
    public String getVersion() {
        return versionNumber;
    }

    public void setVersion(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getRing() {
        return ringTone;
    }

    public void setRing(String ringTone) {
        this.ringTone = ringTone;
    }
}