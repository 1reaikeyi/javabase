package Exends;

public class B extends A{
    public static int b = 0;

    public B()  {
        System.out.println("B的构造方法");
        b++;
        System.out.println("b:"+b);

    }

}
