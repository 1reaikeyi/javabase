package 线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class 线程池 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5,
                3, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new ThreadPoolExecutor.AbortPolicy());
        Thread t = new Thread1();
        executor.execute(t);
        executor.execute(t);
        executor.execute(t);
        //
        executor.execute(t);
        executor.execute(t);
        //
        executor.execute(t);
        executor.execute(t);
        //error
//        executor.execute(t);

        executor.shutdown();
    }
}
