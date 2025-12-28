package 泛型;
class dog{}
class cat{}
class xiaomi extends Car{
    @Override
    public  void run() {
        System.out.println("xiaomi跑");
    }
    public void fly(){
        System.out.println("xiaomi飞");
    }
}
class wuling extends Car{
    @Override
    public void run() {
        System.out.println("wuling跑");
    }
    public void fly(){
        System.out.println("wuling飞");
    }
}

public class Car {
    public void run(){
        System.out.println("跑");
    }

}

