package itmo.java.basics.lesson6;

public class Parent1 {
    protected int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Возраст равен: " + age);
    }
}
