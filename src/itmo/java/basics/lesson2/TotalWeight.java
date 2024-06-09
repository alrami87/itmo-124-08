package itmo.java.basics.lesson2;

public class TotalWeight {
    public static Double getTotalWeight(Conditioner conditioner, Double packageWeight) {
        if (packageWeight == null) {
            return conditioner.getWeight();
        }
        return conditioner.getWeight() + packageWeight;
    }
}
