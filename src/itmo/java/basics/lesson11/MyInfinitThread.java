package itmo.java.basics.lesson11;

public class MyInfinitThread {
    public synchronized void print1() {
        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


