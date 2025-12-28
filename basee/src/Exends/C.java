package Exends;



public class C extends B{
    public static int c = 0;
    public C()  {
        System.out.println("c的构造方法");
        c++;
        System.out.println("c:"+c);

    }

}
