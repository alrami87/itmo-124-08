package itmo.java.basics.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1.
        Client client1 = new Client("Brad", "Pitt");
        client1.setBankName("Bank of America");

        Client client2 = new Client("Tom", "Cruise", "The Capital Bank");

        client1.printInfo();
        client2.printInfo();

        Banker banker = new Banker("Steven", "Spielberg");
        banker.setBankName("Lehman Brothers");

        banker.printInfo();
        banker.printBank();

// 2.
        Employee banker2 = new Banker("Jack", "Daniels", "Super Bank");
        printBank(banker2);

// 3.
        Car car = new Car(1600, "vesta", 'g', 210F);
        car.outPut();

        Car car1 = new Car(1500, "granta", 'b', 190.5F);
        car1.outPut();

        Truck truck = new Truck(5200, "kamaz", 'y', 150F, 6, 7500);
        truck.outPut();

        truck.newWheels(10);
        truck.outPut();

// 4.
        Scanner scanner = new Scanner(System.in);

        Child child = new Child();
        System.out.println("введите число");
        int param = scanner.nextInt();
        child.setParam(param);
        System.out.println("Переменная из главного класса: " + child.getParam());

// 5.
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите параметр");
        if (scan.hasNextInt()) {
            Parent1 child1 = new Parent1();
            child1.setAge(scan.nextInt());
            child1.printInfo();
        } else if (scan.hasNextLine()) {
            Child1 child1 = new Child1();
            child1.setName(scan.nextLine());
            child1.printInfo();
        }
    }

    public static void printBank(Employee emploee) {
        emploee.printBank();
    }
}
