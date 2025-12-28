package project.xiangmu1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Foodoperate {
    private ArrayList<xiangmu1_ArrayList.food>  foodlist= new ArrayList<xiangmu1_ArrayList.food>();
    public void addfood()
    {
        xiangmu1_ArrayList.food f = new xiangmu1_ArrayList.food();
        Scanner sc = new Scanner(System.in);
        System.out.println("菜名：");
        String name = sc.next();
        f.setMenu(name);
        System.out.println("价格：");
        double price = sc.nextDouble();
        f.setPrice(price);
        System.out.println("说明：");
        String guide = sc.next();
        f.setGuide(guide);
        foodlist.add(f);
    }
    public void show()
    {if(foodlist.size()==0)
    {
        System.out.println("无");

    }
        for (int i = 0; i < foodlist.size(); i++) {
            food f = foodlist.get(i);
            System.out.print("菜名：");
            System.out.println(f.getMenu());
            System.out.print("价格：");
            System.out.println(f.getPrice());
            System.out.print("说明：");
            System.out.println(f.getGuide());
        }
    }
    public void math()
    {int a = 1;
        while(a!=0){
            System.out.println("0:tuichu;1:add;2:show");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num)
            {case 1: addfood();break;
                case 2: show();break;
                case 0:a=0;System.out.println("已退出");break;
                default:
                    System.out.println("不在范围");
            }
        }
    }

}
