package main.task_2;

@Repeat(count = 3)
public class MyRunnable implements Runnable{
    @Override
    public void run() { System.out.println("Hello Bro!");
    }
}
