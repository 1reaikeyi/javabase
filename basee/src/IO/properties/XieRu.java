package IO.properties;

import java.io.FileWriter;
import java.util.Properties;

public class XieRu {
    public static void main(String[] args) throws Exception{
         Properties p = new Properties();
         p.setProperty("name","zhangsan");
         p.setProperty("id","20");
         System.out.println(p);
         p.store(new FileWriter("basee/src/IO/properties/first.properties"),
                 "properties");

    }
}
