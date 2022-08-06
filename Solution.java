import java.lang.invoke.VarHandle.AccessMode;
import java.util.Arrays;
import java.util.function.LongSupplier;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String s = "";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = ch.length - 1; i >= 0; i--) {
            s += ch[i];
        }
        answer = Long.parseLong(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 4, 3, 2, 1 };
        long returntest = solution.solution(118372);
        System.out.println(returntest);

    }

}