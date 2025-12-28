package lIO_wenjian;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
//        D:\java.项目\helloworld\moker\src\IO_wenjian\word----------------途径
        try (FileInputStream fis = new FileInputStream("D:\\java.项目\\helloworld\\moker\\src\\IO_wenjian\\word")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        用于从文件中读取字节数据。
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\java.项目\\helloworld\\moker\\src\\IO_wenjian\\word"))) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = bis.read(buffer)) != -1) {
                String data = new String(buffer, 0, length);
                System.out.print(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        代码使用BufferedInputStream读取文件，通过缓冲区一次性读取较多数据，提高效率。
        try (DataInputStream dis = new DataInputStream(new FileInputStream("D:\\java.项目\\helloworld\\moker\\src\\IO_wenjian\\word"))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            System.out.println("Int value: " + intValue);
            System.out.println("Double value: " + doubleValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        允许应用程序以与机器无关方式从底层输入流中读取基本 Java 数据类型
    }
}
