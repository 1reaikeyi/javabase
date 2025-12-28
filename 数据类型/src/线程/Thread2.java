package 线程;

public class Thread2 implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("线程输出"+i);
        }
    }
}
