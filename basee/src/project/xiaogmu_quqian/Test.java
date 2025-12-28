package xiaogmu_quqian;

public class Test {
  public static void main(String[] args) {
    Account account = new Account(1000, "交通银行");
    Threadtest t1 = new Threadtest("小明", account, 1000);
    Threadtest t2 = new Threadtest("小红", account, 1000);
    t1.start();
    t2.start();

    Account account2 = new Account(10000, "交通银行");
    Threadtest t3 = new Threadtest("王五", account2, 10000);
    Threadtest t4 = new Threadtest("老赵", account2, 10000);
    t3.start();
    t4.start();
  }
}
