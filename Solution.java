import java.util.Arrays;
import java.util.function.LongSupplier;

class Solution {
    public int solution(LongSupplier num) {
        int answer = 0;
        while (num != 1) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            System.out.println(answer);
            if (answer >= 450) {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 4, 3, 2, 1 };
        int returntest = solution.solution(1);
        System.out.println(returntest);

    }

}