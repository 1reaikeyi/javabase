package 线程;

public class Thread1 extends Thread{
//    public Thread1(String name) {
//        super(name);
//    }

    @Override
    public void run() {

//        Thread t = Thread.currentThread();
//        //老板要求加的，让线程休眠1秒
//        //充vip给去除这里执行的话，就会先执行主线程，再执行子线程
//        try {
//            t.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("t.getName() = " + t.getName());
//        for (int i = 0; i < 20; i++) {
//            System.out.println("Thread线程输出"+i);
//        }
        Thread t = Thread.currentThread();
        System.out.println("t.getName() = " + t.getName());
        System.out.println(t.getName()+"addThread开始");
        System.out.println(t.getName()+"addThread结束");
    }
}
