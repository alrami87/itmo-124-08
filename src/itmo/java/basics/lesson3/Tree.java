package itmo.java.basics.lesson3;

public class Tree {
    private double age;
    private Boolean isAlive;
    private String name;

    public Tree(Double age, String name) {
        this.age = age;
        this.name = name;
    }
    public Tree(Double age, Boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
    public  Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age + ", " +
                "is alive=" + isAlive + ", " +
                "name='" + name + "'" +
                "}";
    }
}
