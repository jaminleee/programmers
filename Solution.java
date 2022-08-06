import java.lang.invoke.VarHandle.AccessMode;
import java.util.Arrays;
import java.util.function.LongSupplier;

import javax.management.monitor.CounterMonitor;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp[count] = arr[i];
                count++;
            }
        }
        if (count == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
            for (int i = 0; i < count; i++) {
                answer[i] = temp[i];
            }
            Arrays.sort(answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 3, 2, 6 };
        int[] returntest = solution.solution(arr, 10);
        System.out.println(returntest[1]);

    }

}