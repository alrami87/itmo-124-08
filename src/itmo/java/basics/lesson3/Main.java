package itmo.java.basics.lesson3;

public class Main {
    public static void main(String[] args) {
// 1.
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        Car car1 = new Car(Color.GREEN, 2682.0);
        car1.setName("Ford");
// 2.
        System.out.println();
        Car car2 = new Car();
        car2.setName("Skoda");
        car2.setColor(Color.BLUE);
        car2.setWeight(1534.2);

        System.out.println(car1);
        System.out.println(car2);
// 3.
        System.out.println();
        House house1 = new House();
        House house2 = new House();

        house1.setName("Ветеранов 24А");
        house1.setFloorCount(9);
        house1.setYearOfBuilt(1970);
        System.out.println(house1 + " age=" + house1.getAge());

        house2.setName("Московский просп. 245");
        house2.setFloorCount(12);
        house2.setYearOfBuilt(2001);
        System.out.println(house2 + " age=" + house2.getAge());
// 4.
        System.out.println();
        Tree tree1 = new Tree(27.8, "Клён");
        Tree tree2 = new Tree(27.8, Boolean.TRUE, "Берёза");
        Tree tree3 = new Tree();
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}