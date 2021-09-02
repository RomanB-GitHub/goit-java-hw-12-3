package main.task_1;

public class MainTest {
    public static void main(String[] args) {

        Water water = new Water();
        String molecules = "OOHHHH";

        Runnable releaseHydrogen = () -> System.out.print("H");
        Runnable releaseOxygen = () -> System.out.print("O");

        for (int i = 0; i < molecules.length(); i++) {
            char ch = molecules.charAt(i);
            if (ch == 'O') {
                new Thread(()->{
                    try {
                        water.oxyGen(releaseOxygen);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }).start();
            }else if (ch =='H'){
                new Thread(()->{
                    try{
                        water.hydroGen(releaseHydrogen);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }).start();

            }
        }
    }
}
