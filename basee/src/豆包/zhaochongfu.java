package 豆包;

import java.util.Random;

public class zhaochongfu {
    //1+22+333+4444+55555******
//    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);
//        int s=0 ;
//        int m = sc1.nextInt();
//        int n = sc1.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            int num = 0;
//            for (int j = 0; j < i; j++) {
//                num = 10*num+m;
//            }
//            System.out.println("num = " + num);
//            s=s+num;
//        }
//        System.out.println(s);
//    }
//    输入项数：借助 Scanner 类读取用户输入的项数 n。
//    外层循环：循环从 1 到 n，每一次循环代表数列中的一项。
//    内层循环：循环 i 次，每次循环将当前的 i 拼接到 num 后面，进而生成由 i 重复 i 次的数字。
//    累加求和：把每一项的结果累加到 s 中。
//    输出结果：输出最终的求和结果。
    //========================================
//    public static void printDuplicatesAndCounts(int[] arr) {
//        boolean[] visited = new boolean[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            // 检查当前元素是否已经被处理过
//            if (visited[i]) {
//                continue;
//            }
//            int count = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    // 标记相同元素为已处理
//                    visited[j] = true;
//                }
//            }
//
//            if (count > 1) {
//                System.out.println(arr[i] + " 出现了 " + count + " 次");
//            } else {
//                System.out.println(arr[i]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] a = {11, 12, 13, 14, 15, 16, 12, 13, 14};
//        printDuplicatesAndCounts(a);
//    }
////    在之前用于统计数组元素出现次数并打印的代码中，if (visited[i]) { continue; } 这行代码起到了关键的去重作用，下面详细为你解释其功能。
//    功能概述
//    这行代码位于外层循环内部，其作用是检查当前元素是否已经被处理过。如果 visited[i] 为 true，意味着该元素已经被处理过，此时使用 continue 语句跳过本次循环，直接进入下一次循环，不再对该元素进行重复处理。
//    详细解释
//    visited 数组：这是一个布尔类型的数组，长度与待处理的数组 arr 相同。数组中的每个元素对应 arr 中的一个元素，用于标记该元素是否已经被处理过。初始时，visited 数组的所有元素都为 false，表示所有元素都未被处理。
//    visited[i]：表示 arr 数组中第 i 个元素是否已经被处理过。如果为 true，则表示该元素已经被处理过；如果为 false，则表示该元素尚未被处理。
//            continue 语句：当 visited[i] 为 true 时，执行 continue 语句，跳过本次循环的剩余部分，直接进入下一次循环。这样可以避免对已经处理过的元素进行重复处理。
//    =========================================================
//    public static void main(String[] args) {
//        Random random = new Random();
//        int a = random.nextInt(2, 100);
//        System.out.println(a);
//        boolean flag = true;
//        for (int i = 2; i < (int)Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                flag = false;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println(a + "是素数");
//        }else {
//            System.out.println(a + "不是素数");
//        }
//
//    }
//    =======================================================
    public static void main(String[] args) {
        Random random = new Random();
        int m1 = random.nextInt(10, 21);
        int m2 = random.nextInt(30, 41);
        System.out.println(m1);
        System.out.println(m2);
        int a = m1;//10------20
        int b = m2;//20--------10
        while (b != 0) {
            int temp = b;//temp=20---------------temp=10
            b = a % b;//b=10---------------------b=0
            a = temp;//a=20-----------------------a=10
        }
        int gcd = a;
        System.out.println("最大公约数是: " + gcd);
        int maxtime = m1 * m2 / gcd;
        System.out.println("最小公倍数是: " + maxtime);
//        在 main 方法中调用 gcd 方法计算 m1 和 m2 的最大公约数，存储在 gcdValue 中。
//        根据公式 lcm(m1, m2) = m1 * m2 / gcd(m1, m2) 计算最小公倍数，存储在 lcmValue 中。

    }
//    ==============================================================





}
