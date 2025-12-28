package 豆包;

public class ErJInZhiwenti {

    public static int solution(int N) {
        // Please write your code here


        String n = Integer.toBinaryString(N);
int num[] = new int[n.length()];
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
//            int bit = n.charAt(i) - '0';
//            System.out.println(bit);
//            int invertedBit = 1 - bit; // 反码操作
//            sum += invertedBit * Math.pow(2, n.length() - 1 - i);
            num[i] = n.charAt(i) - '0';
            System.out.println("(num[i]) = " + (num[i]));
        }
        for (int i = 0; i < n.length(); i++) {
            if (num[i] == 0) {
                num[i] = 1;
            }
            else if(num[i] == 1){
                num[i] = 0;
            }
            System.out.println("num[i] = " + num[i]);
        }
        
        for (int i = 0; i < n.length(); i++) {
            sum += num[i] * Math.pow(2, n.length() - 1 - i);
        }
        // 调试信息
        System.out.println("sum = " + sum);
        

        return sum;



    }
    public static void main(String[] args) {
    System.out.println(solution(5) == 2 ? 1 : 0);
    System.out.println(solution(10) == 5 ? 1 : 0);
    System.out.println(solution(0) == 1 ? 1 : 0);
}
}
