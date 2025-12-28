package lIO_wenjian.properties_wenjian;

import java.io.FileWriter;
import java.util.Properties;

public class XieRu {
    public static void main(String[] args) throws Exception{
         Properties p = new Properties();
         p.setProperty("name","zhangsan");
         p.setProperty("id","18");
         System.out.println(p);
         p.store(new FileWriter("D:\\java.项目\\helloworld\\moker\\src\\properties_wenjian\\first.properties"),
                 "properties");

    }
}
