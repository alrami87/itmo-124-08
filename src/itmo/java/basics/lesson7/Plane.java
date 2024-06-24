package itmo.java.basics.lesson7;

public class Plane {
    public class Wing {
        private int wingWeight;

        public Wing(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void printWeight() {
            System.out.println("Вес крыла составляет " + wingWeight);
        }
    }

    public void setWingWeight(int weight) {
        Wing wing = new Wing(weight);
        wing.printWeight();
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.setWingWeight(2500);

        Plane plane2 = new Plane();
        plane2.setWingWeight(3200);
    }

}