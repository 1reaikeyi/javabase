package 豆包;

public class PaiChengZuiDashu {
    public static int solution(int a, int b) {
        // 将数字 a 转换为字符串
        String aStr = Integer.toString(a);
        // 将数字 b 转换为字符串
        String bStr = Integer.toString(b);

        // 初始化最大结果为插入到最前面的情况
        String maxResult = bStr + aStr;

        // 遍历字符串 a 的每个位置
        for (int i = 0; i <= aStr.length(); i++) {
            // 尝试将 b 插入到位置 i
            String newResult = aStr.substring(0, i) + bStr + aStr.substring(i);
            // 更新最大结果
            if (newResult.compareTo(maxResult) > 0) {
                maxResult = newResult;
            }
        }

        // 返回最大结果
        return Integer.parseInt(maxResult);
    }

    public static void main(String[] args) {
        System.out.println(solution(76543, 4) == 765443);
        System.out.println(solution(1, 0) == 10);
        System.out.println(solution(44, 5) == 544);
        System.out.println(solution(666, 6) == 6666);
    }
}

