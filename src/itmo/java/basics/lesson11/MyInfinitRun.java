package itmo.java.basics.lesson11;

public class MyInfinitRun extends Thread {
    MyInfinitThread infinit;
    MyInfinitRun(MyInfinitThread infinit){
        this.infinit=infinit;
    }

    @Override
    public void run() {
        do {
            infinit.print1();
            System.out.println(getName());
        } while (true);
    }
}
