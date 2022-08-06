import java.lang.invoke.VarHandle.AccessMode;
import java.util.Arrays;
import java.util.function.LongSupplier;

import javax.management.monitor.CounterMonitor;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char ch[] = s.toCharArray();
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if ((int) ch[i] < 48 || (int) ch[i] > 57) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 3, 2, 6 };
        boolean returntest = solution.solution("1234");
        System.out.println(returntest);

    }

}