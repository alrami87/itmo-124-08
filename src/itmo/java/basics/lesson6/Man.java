package itmo.java.basics.lesson6;

public abstract class Man {
    private String name;
    private String surName;

    public abstract void printInfo();

    public Man(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }


}
