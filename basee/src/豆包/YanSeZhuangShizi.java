package 豆包;

public class YanSeZhuangShizi {
    public static int solution(String rgb) {
        // Please write your code here
        String[] s = new String(rgb.substring(4,rgb.length() - 1)).split(",");

        int r = Integer.parseInt(s[0].trim());
        int g = Integer.parseInt(s[1].trim());
        int b = Integer.parseInt(s[2].trim());
//        String Color = String.format("%02x%02x%02x", r, g, b);
//        System.out.println(Color);
        System.out.println("r = " + r);
        System.out.println("g = " + g);
        System.out.println("b = " + b);
        String hexColor = String.format("%02x%02x%02x", r, g, b);

        // 将十六进制字符串转换为十进制整数
        return Integer.parseInt(hexColor, 16);

    }

    public static void main(String[] args) {
        //  You can add more test cases here
        System.out.println(solution("rgb(192, 192, 192)") == 12632256);
        System.out.println(solution("rgb(100, 0, 252)") == 6553852);
        System.out.println(solution("rgb(33, 44, 55)") == 2174007);
    }
}
