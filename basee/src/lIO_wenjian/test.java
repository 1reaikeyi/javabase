package lIO_wenjian;

import java.io.File;

public class test {
    public static void main(String[] args) throws Exception {
//        //打开
//        File file1 = new File("C:\\Users\\lenovo\\Desktop\\a.txt");
//        //检查null
//        System.out.println("file1.exists() = " + file1.exists());
//        //长度length
//        System.out.println(file1.length());
//        //检查是否是txt  isFile
//        System.out.println(file1.isFile());
//        //检查是否是文件夹isDirectory
//        System.out.println(file1.isDirectory());
//        //获取名字grtname
//        System.out.println(file1.getName());
//        //上次修改时间lastModified
//        long time = file1.lastModified();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(time));
//        //路径getpath
//        System.out.println(file1.getPath());
//        ========================================
//        //创建
//        File f1 = new File("C:\\Users\\lenovo\\Desktop\\a2.txt");
//        System.out.println(f1.createNewFile());

        //创建文件夹mkdir
////        File f2 = new File("C:\\Users\\lenovo\\Desktop\\abc");
////        System.out.println(f2.mkdir());
//        //多级mkdirs
//        //删除delete        **不能是空文件包
//        System.out.println(f1.delete());
        File f1 = new File("C:\\Users\\lenovo\\Desktop\\计算机部门长");
        String[] name = f1.list();
        for (String s : name) {
            System.out.println(s);
        }

//        File[] f2 = f1.listFiles();
//        for (int i = 0; i < f2.length; i++) {
//            System.out.println(i+f1.getAbsolutePath());
//        }




    }
}
