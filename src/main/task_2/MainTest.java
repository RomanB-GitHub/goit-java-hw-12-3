package main.task_2;

public class MainTest {
    public static void main(String[] args) {
        MyThreadPoolExecutor myExecutor = new MyThreadPoolExecutor(10);
        myExecutor.execute(new MyRunnable());
    }
}
