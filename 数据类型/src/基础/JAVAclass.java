package 基础;


public class JAVAclass {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("你好");

////        进制
//        int a1,a2,a3;
//        a1 =0b1111;
//        a2=012;
//        a3 = 0XA;
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);

////        +,-,*,/,%运算
////        +，还可以拼接
//        System.out.println("abc"+120);


        //键盘输入
        //引入import java.util.Scanner;在外部
//        Scanner sc=new Scanner(System.in);
//        int age = sc.nextInt();
//        System.out.println(age);
//        String m=sc.next();
//        System.out.println(m);

        //if语句
//        Scanner sc=new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a>10)
//        {
//            System.out.println("hehe");
//        }
//        else
//        {
//            System.out.println("haha");
//        }
        //for语句
//        for (int i=0;i<6;i++)
//        {System.out.println("nihao");}
        //while语句
//        int i=0;
//        while(i<6)
//        {System.out.println("China");
//        i++;}
        //do---while
//        int i=0;
//        do{
//            System.out.println("China");
//            i++;
//        }while(i<3);


//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
//        int rows = 5; // 定义三角形的行数
//        for (int i = 1; i <= rows; i++) {
//            // 打印空格
//            for (int j = rows - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            // 打印星号
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println(); // 换行
//        }
//       rows=4;
//
//        for (int i = rows; i >= 1; i--) {
//            // 打印空格
//            for (int j = 0; j < rows - i; j++) {
//                System.out.print(" ");
//            }
//            // 打印星号
//            System.out.print(" ");
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println(); // 换行
//        }


//        //静态数组
//        //第一种
//        int[] arr={1,2,3};
//        //第二种
//        int[] b=new int[]{1,2,3,4};
//        System.out.println(arr[0]);
//        b[0]=666;
//        System.out.println(b[0]);
//        //长度length
//        int len=b.length;
//        System.out.println(len);
//        System.out.println("------------");
//        //遍历
//        for (int i=0;i<len;i++)
//        {
//            System.out.println(b[i]);
//        }
//        System.out.println("------------");
//        System.out.println("------------");
//        //动态数组 初始化是0
//        int[] m=new int[5];//0 0 0 0 0
//        m[0] = 100;
//        for (int i = 0; i < m.length ; i++)
//        {
//            System.out.println(m[i]);
//        }
//
        //录入
//        int[] arr=new int[6];
//
//        for(int i=0;i<arr.length;i++)
//        {Scanner sc= new Scanner(System.in);
//            System.out.println("第"+(i+1)+"次");
//            arr[i]=sc.nextInt();
//
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("第"+i+"次"+arr[i]);
//
//        }


        //随机数
        //引入import java.util.Random;
//        Random r=new Random();
        //int a=r.nextInt(6)+1;


        //调试
//        for (int i = 0; i < 10; i++) {
//            int a=r.nextInt(6)+1;
//            System.out.println(a);
//        }

        //方法（函数）

//        int[] m={11,22,33};
//
//        m(m);
//        System.out.println("------------");
//        for (int i=0;i<m.length;i++)
//        {
//            System.out.println(m[i]);
//        }
//        System.out.println("------------");
//        System.out.println(m);
//        int[] b=m;
//        System.out.println(b);
//        for (int i=0;i<b.length;i++)
//        {
//            System.out.println(b[i]);
//        }
//        int[] a={0,1};


//        public class OverloadingExample {
//            // 方法一：计算两个整数的和
//            public static int add(int a, int b) {
//                return a + b;
//            }
//
//            // 方法二：计算三个整数的和，参数数量不同
//            public static int add(int a, int b, int c) {
//                return a + b + c;
//            }
//
//            // 方法三：计算两个浮点数的和，参数的数据类型不同
//            public static double add(double a, double b) {
//                return a + b;
//            }
//
//            // 方法四：计算一个整数和一个浮点数的和，参数的数据类型顺序不同
//            public static double add(int a, double b) {
//                return a + b;
//            }
//
//            // 方法五：计算一个浮点数和一个整数的和，参数的数据类型顺序不同
//            public static double add(double a, int b) {
//                return a + b;
//            }
//
//            public static void main(String[] args) {
//                // 调用不同的重载方法
//                System.out.println(add(2, 3));
//                System.out.println(add(2, 3, 4));
//                System.out.println(add(2.0, 3.0));
//                System.out.println(add(2, 3.0));
//                System.out.println(add(2.0, 3));
//            }
//        }

    }

}














