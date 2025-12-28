package 线程;

import java.util.concurrent.Callable;

public class Thread3 implements Callable<String> {
    public Thread3() {
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程输出"+i);
        }
        return "Callable";
    }
}
