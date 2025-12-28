package lIO_wenjian.properties_wenjian;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        System.out.println("p = " + p);
        p.load(new FileReader("D:\\java.项目\\helloworld\\moker\\src\\properties_wenjian\\first.properties"));
        System.out.println(p);
        System.out.println(p.getProperty("疑是地上霜"));
        Set<String> sk = p.stringPropertyNames();
        for (String s : sk) {
            System.out.println(s+"="+p.getProperty(s));
        }

    }
}