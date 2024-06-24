package itmo.java.basics.lesson6;

public class Client extends Man{
    private String bankName;

    public Client(String name, String surName) {
        super(name, surName);
    }
    public Client(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void printInfo(){
        System.out.println("Client {name: " + getName() + ", surname: " + getSurName() + ", bank: '" + bankName + "'}");
    }
}
