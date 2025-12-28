package lIO_wenjian;

import java.io.File;

public class Search {
    public static void main(String[] args) {
        Search(new File("D:\\"),"哔哩哔哩.exe");
    }
    public static void Search(File dir,String name){
        if(dir ==null||!dir.exists()){

            return;
        }
        File[] files = dir.listFiles();
        if(files!=null&&files.length>0){
            for (File file : files) {
                if(file.isFile()){
                    if(file.getName().equals(name)){
                        System.out.println("找到了"+file.getAbsolutePath());

                    }

                }
                else{
//                    System.out.println("进入了"+file.getAbsolutePath());
                    Search(file,name);
                }
            }
        }


    }
}
