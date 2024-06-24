package itmo.java.basics.lesson6;

public class Banker extends Man implements Employee{
    private String bankName;

    public Banker(String name, String surName) {
        super(name, surName);
    }

    public Banker(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Banker {Name: " + getName() + ", Surname: " + getSurName() + ", Bank: '" + bankName + "'}");
    }

    @Override
    public void printBank() {
        System.out.println("I'm working in '" + this.bankName + "'");
    }
}
