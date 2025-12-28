package staticc;


public class JAVAstatic {

    public static class student
    {   static String name;
        int age;
        static int num;
        public student()
        {num++;}
    }


    //static{},静态代码，所有对象=执行一次
//    static {
//        System.out.println("这是static~~~~");
//    }
    //{},每个对象都执行
//    {
//        System.out.println("这是动态区~~~~~~");
//    }
    //唯一性
//    public static class weiyi
//    {private static weiyi a = new weiyi();
//    private weiyi()
//    {}
//    public static weiyi getA()
//    {
//        return a;
//    }
//    }
//    public static class weiyi2 {
//        private static weiyi2 a = new weiyi2();
//
//        private weiyi2() {
//        }
//
//        public static weiyi2 getInstance() {
//            if (a == null) {
//                System.out.println("第一个对象");
//                a = new weiyi2();
//            }
//            return a;
//        }
//
//
//    }



    public static class Number{
        static int num = 0;

        public Number()
        {   Number.num++;
        }

        static {
            System.out.println("这是static~~~~");
        }

        {
            System.out.println("这是动态区~~~~~~");
        }
    }

    public static void main(String[] args) {
//        student.name = "熊大";
//        student stu1 = new student();
//        student stu2 = new student();
//        stu1.name = "xiaoming";
//        stu2.name = "alibaba";
//        System.out.println(student.name);//alibaba
//        System.out.println(stu1.name);//alibaba
//        System.out.println(stu2.name);//alibaba
////        student.age = "错误写法";
//        stu1.age = 18;
//        stu2.age = 17;
//        System.out.println(stu1.age);//18
//        System.out.println(stu2.age);//17

//        int num=0;
        Number num1 = new Number();
        Number num2 = new Number();
        Number num3 = new Number();
        Number num4 = new Number();
        Number num5 = new Number();
        Number num6 = new Number();
//        System.out.println(Number.num);//out = 6;
//        weiyi x1 = weiyi.getA();
//        weiyi x2 = weiyi.getA();
//        System.out.println(x1);
//        System.out.println(x2);
//        weiyi2 q1 = weiyi2.getInstance();
//        weiyi2 q2 = weiyi2.getInstance();
//        System.out.println(q1);
//        System.out.println(q2);
//        System.out.println(q1 == q2);
        student b = new student();
        student.name = "熊二";
        b.name = "吉吉";
        b.age = 18;
        System.out.println(student.name);
        System.out.println(b.age);

    }
}
