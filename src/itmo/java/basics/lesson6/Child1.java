package itmo.java.basics.lesson6;

public class Child1 extends Parent1{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + this.name);
    }
}
