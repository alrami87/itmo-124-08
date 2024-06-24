package itmo.java.basics.lesson6;

public class Truck extends Car{
    private int wheelsCount;
    private int maxWeight;

//    public Truck(int w, String m, char c, float s) {
//        super(w, m, c, s);
//    }

    public Truck(int w, String m, char c, float s, int wheelsCount, int maxWeight) {
        super(w, m, c, s);
        this.wheelsCount = wheelsCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Новое количество колес " + this.wheelsCount);
    }



    @Override
    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колес " + wheelsCount + " и максимальный вес " + maxWeight + "кг.");
    }
}