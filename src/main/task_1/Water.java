package main.task_1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Water {
    private final CyclicBarrier cyclicBarrier;
    private final Semaphore oxyGenSemaphore;
    private final Semaphore hydroGenSemaphore;

    public Water() {
        cyclicBarrier = new CyclicBarrier(3);
        oxyGenSemaphore = new Semaphore(1);
        hydroGenSemaphore = new Semaphore(2);
    }

    public void hydroGen(Runnable releaseHydrogen) throws InterruptedException {
        hydroGenSemaphore.acquire();
        try {
            cyclicBarrier.await();
        } catch (BrokenBarrierException e) {

            e.printStackTrace();
        }
        releaseHydrogen.run();
        hydroGenSemaphore.release();
    }

    public void oxyGen(Runnable releaseOxygen) throws InterruptedException {
        oxyGenSemaphore.acquire();
        try {
            cyclicBarrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        releaseOxygen.run();
        oxyGenSemaphore.release();
    }
}
