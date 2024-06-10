package itmo.java.basics.lesson3;

public class Car {
    private String name;
    private Color color;
    private Double weight;

    public Car() {}

    public Car(Color color){
        this.color = color;
    }

    public Car(Color color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + "', " +
                "color='" + color + "', " +
                "weight='" + weight + "'" +
                "}";
    }
}
