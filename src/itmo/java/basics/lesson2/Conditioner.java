package itmo.java.basics.lesson2;

public class Conditioner {
    private String brand;
    private String model;
    private Integer modeCount;
    private Double weight;
    private Double power;
    private Version version;
    private Long price;
    private Boolean isInverter;

    public Conditioner() {

    }

    public Conditioner(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Conditioner(String brand, String model, Boolean isInverter) {
        this.brand = brand;
        this.model = model;
        this.isInverter = isInverter;
    }

    public Conditioner(String brand, String model, Integer modeCount, Double weight, Double power, Version version, Long price, Boolean isInverter) {
        this.brand = brand;
        this.model = model;
        this.modeCount = modeCount;
        this.weight = weight;
        this.power = power;
        this.version = version;
        this.price = price;
        this.isInverter = isInverter;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModeCount() {
        return modeCount;
    }
    public void setModeCount(Integer modeCount) {
        this.modeCount = modeCount;
    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPower() {
        return power;
    }
    public void setPower(Double power) {
        this.power = power;
    }

    public Version getVersion() {
        return version;
    }
    public void setVersion(Version version) {
        this.version = version;
    }

    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }

    public Boolean getIsInverter() {
        return isInverter;
    }
    public void setIsInverter(Boolean isInverter) {
        this.isInverter = isInverter;
    }

    @Override
    public String toString() {
        return "Conditioner{" +
                "brand='" + brand + "'" +
                ", model='" + model + "'" +
                ", modeCount=" + modeCount +
                ", weight=" + weight +
                ", power=" + power +
                ", version=" + version +
                ", price=" + price +
                ", isInverter=" + isInverter +
                "}";
    }
}
