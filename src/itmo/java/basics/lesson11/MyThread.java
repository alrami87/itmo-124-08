package itmo.java.basics.lesson11;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + "   " + i);
        }
    }
}
