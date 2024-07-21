package itmo.java.basics.lesson11;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
// 1.
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }

// 2.
        Thread myThread = new MyThread();
        System.out.println("Перед запуском состояние = " + myThread.getState());

        myThread.start();
        System.out.println("После запуск состояние = " + myThread.getState());

        while (myThread.isAlive()) {}
        System.out.println("После выполнения состояние = " + myThread.getState());

// 3.
        Counter counter = new Counter();
        int threadCount = 100;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            new MyCounterThread(counter, countDownLatch).start();
        }
        countDownLatch.await();
        System.out.println(counter.getCount());

// 4.
        MyInfinitThread infinit = new MyInfinitThread();

        new MyInfinitRun(infinit).start();
        new MyInfinitRun(infinit).start();
    }
}


