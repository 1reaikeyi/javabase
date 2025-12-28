package lIO_wenjian;

import java.io.FileReader;
import java.io.IOException;

public class File_reader {
    public static void main(String[] args) {
        //字符流
        try {
            FileReader f = new FileReader("D:\\java.项目\\helloworld\\moker\\src\\IO_wenjian\\word");
//            int c;
//            while ((c=f.read())!=-1){
//                System.out.println((char)c);
//            }
//            一次读取多个字符
            char[] c = new char[2];
            int len;
            while ((len = f.read(c)) != -1) {
                String s = new String(c, 0, len);
                System.out.println(s);

//            char[] r = f.readAllChars();
//            String s = new String(r);
//            System.out.println(s);
//            }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}