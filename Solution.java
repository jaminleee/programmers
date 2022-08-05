import java.util.Arrays;
import java.util.function.LongSupplier;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);
        if (Math.pow(sqrt, 2) == n) {
            answer += Math.pow(sqrt + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 4, 3, 2, 1 };
        long returntest = solution.solution(121);
        System.out.println(returntest);

    }

}