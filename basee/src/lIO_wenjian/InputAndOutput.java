package lIO_wenjian;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputAndOutput {
    public static void main(String[] args)throws Exception {
        InputStream i = new FileInputStream("D:\\java.项目\\helloworld\\moker\\src\\IO_wenjian\\word");
        //读读读读读读
//        int a = i.read();
//        System.out.println((char)a);
        //一次一个字节
//        int a;
//        // 循环读取文件内容，直到文件末尾
//        while ((a = i.read()) != -1) {
//            System.out.print((char) a);
//        }

        //一次多个字节
//        byte[] bytes1 = new byte[3];
//        i.read(bytes1);
//        System.out.println(Arrays.toString(bytes1));
//        byte[] bytes2 = new byte[3];
//        i.read(bytes2);
//        System.out.println(Arrays.toString(bytes2));
//        byte[] bytes3 = new byte[3];
//        i.read(bytes3);
//        System.out.println(Arrays.toString(bytes3));
//        byte[] bytes4 = new byte[3];
//        i.read(bytes4);
//        System.out.println(Arrays.toString(bytes4));
//        byte[] bytes5 = new byte[3];
//        i.read(bytes5);
//        System.out.println(Arrays.toString(bytes5));
//        byte[] bytes6 = new byte[3];
//        i.read(bytes6);
//        System.out.println(Arrays.toString(bytes6));
//        byte[] bytes = new byte[3];
//        i.read(bytes);
//        System.out.println(Arrays.toString(bytes));

//        byte[] bytes = new byte[3];
//        while((i.read(bytes)) != -1){
//            System.out.println(Arrays.toString(bytes));
//            String s = new String(bytes);
//            System.out.println("一次3字节 = " + s);
//        }
        //一次读全部
        byte[] b =i.readAllBytes();
        System.out.println(new String(b));
        i.close();
        //写写写写写

//        try (
//                // 声明 OutputStream 资源
//                OutputStream o = new FileOutputStream("D:\\java.项目\\helloworld\\moker\\src\\IO_wenjian\\word");
//                // 声明 Contection 资源
//                AutoClose auto = new AutoClose()
//        ) {
//
//            //换行
////        o.write("\r\n".getBytes());
//            //写一个字节
////        o.write('z');
////        o.write("17".getBytes());
////        o.write("18".getBytes());
////        o.write("19".getBytes());
//            //写多个字节
//            byte[] b = "我和你".getBytes();
//            o.write(b,0,b.length);
//
////            o.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        ：是所有字节输入流的父类，定义了基本的字节读取方法。但通常不会直接使用它，而是使用它的子类。
    }
}
