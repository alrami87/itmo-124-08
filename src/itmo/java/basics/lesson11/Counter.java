package itmo.java.basics.lesson11;

public class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}
