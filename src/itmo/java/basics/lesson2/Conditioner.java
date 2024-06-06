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

}
