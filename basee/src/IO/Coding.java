package IO;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Coding {
    public static void main(String[] args) throws Exception{
        String s = "yuio和hjkl和";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
//        byte[] bytes = s.getBytes("GBk");


        System.out.println(Arrays.toString(bytes));
        //解码
        String s1 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s1);
    }
}
