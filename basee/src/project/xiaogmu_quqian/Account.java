package xiaogmu_quqian;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private double money;
    private String bankName;
    // 初始化锁对象
    private final Lock lock = new ReentrantLock();

    public Account(double money, String bankName) {
        this.money = money;
        this.bankName = bankName;
    }

    public void drawmoney(int money) {
        lock.lock();
        try {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(name + " 正在取款 " + money);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (money > this.money) {
                System.out.println("失败，this.money 余额 = " + this.money);
            } else {
                this.money -= money;
                System.out.println("取款成功，余额为 " + this.money);
            }
        } finally {
            lock.unlock();
        }
    }
}

