package 多态;

class school1{
    public String name;
    public void printname()
    {
        System.out.println(name);
    }
    public void run()
    {
        System.out.println("run,run");
    }
}
class student1 extends school1{
    @Override
    public void run()
    {
        System.out.println("学生在跑");
    }
    public void use() {
        System.out.println("xuexi");
    }
}
class teacher1 extends school1{
    @Override
    public void run()
    {System.out.println("老师在跑");}
    public void use(){
        System.out.println("jiaochu");
    }
}


public class jichu_duotai {
    public static void main(String[] args) {
//        //===========多态
//        school1 p1 = new student1();
//        p1.run();
//        school1 p2 = new teacher1();
//        p2.run();
//        //==========多态
//        System.out.println("=================");
//        student1 o1 = new student1();
//        o1.run();
//        teacher1 o2 = new teacher1();
//        o2.run();
        school1 s = new student1();
        school1 t = new teacher1();

       if(s instanceof student1){
           student1 s1 = (student1)s;
           s.run();
           s1.use();
           (  (student1) s).use();
       }
        if(t instanceof teacher1)
        {teacher1 t1 = (teacher1) t;
            t1.run();
            t1.use();}
        System.out.println("==============");
        student1 s2 = new student1();
        go(s);
        teacher1 t2 = new teacher1();
        go(t2);

    }
    public static void go(school1 a)
    {
        System.out.println("hello");
    }
    //school包含student和teacher
    //school1 是父类
    //student1和teacher1是子类
}
