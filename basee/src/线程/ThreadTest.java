package 线程;

import java.util.concurrent.ExecutionException;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread t  =new Thread1();
////        t.run();
//        //启动线程
//        t.start();
//        //主线程
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main输出："+i);
//        }
        
//        ===========================
//        Runnable runnable = new Thread2();
//        Thread t = new Thread(runnable);
//        t.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main输出："+i);
//        }
//        ===============================
//        Callable<String> call = new Thread3();
//        FutureTask<String> futureTask = new FutureTask(call);
//        Thread t = new Thread(futureTask);
//        t.start();
//        String s = futureTask.get();
//        System.out.println("s = " + s);
//        Thread t1 = new Thread1();
//        t1.start();
//        t1.setName("线程1");
//        System.out.println("t1.getName() = " + t1.getName());
//        Thread t2 = new Thread1();
//        t2.start();
//        t2.join();
//        t2.setName("线程2");
//        System.out.println("t2.getName() = " + t2.getName());
//
//        Thread t3 = Thread.currentThread();
//        t3.setName("主线程");
//        System.out.println("t3.getName() = " + t3.getName());
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main输出 = " + i);
//        }
        System.out.println("main开始");
        Thread a1 = new Thread1();
        a1.start();

       Thread a2 = new Thread1();
        a2.start();
        try {
            // 主线程等待 a1 线程执行完毕
            a1.join();
            // 主线程等待 a2 线程执行完毕
            a2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main结束");

    }

}

