package 豆包;

import java.util.ArrayList;

public class JIShu {

        public static int solution(int n, int[][] array) {
            // Edit your code here
            ArrayList<Integer> list = new ArrayList<>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    list.add(array[i][j]);
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
            int count = 0;
            for (int i = 1; i <= max; i++) {
                int t = 0;
                for (int j = 0; j < list.size(); j++) {

                    if (i == list.get(j)) {
                        t++;
                    }
                    if (t > count) {
                        count = t;
                    }
                }

            }

            return count;
        }



        public static void main(String[] args) {
            // Add your test cases here
            System.out.println(solution(2,new int[][]{{1,2}, {2, 3}}) == 2);
            System.out.println(solution(4, new int[][]{{1, 2}, {2, 3}, {3,5},{4,3}}) == 3);

        }

}
