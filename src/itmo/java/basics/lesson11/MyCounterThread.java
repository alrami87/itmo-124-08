package itmo.java.basics.lesson11;

import java.util.concurrent.CountDownLatch;

public class MyCounterThread extends Thread {
    Counter counter;
    private CountDownLatch countDownLatch;
    MyCounterThread(Counter counter, CountDownLatch countDownLatch){
        this.counter=counter;
        this.countDownLatch = countDownLatch;

    }@Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        countDownLatch.countDown();
    }
}
