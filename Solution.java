import java.util.Arrays;
import java.util.function.LongSupplier;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int askii;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            askii = (int) arr[i];
            if (askii >= 65 && askii <= 90) {
                askii += n;
                if (askii > 90) {
                    askii -= 26;
                }
            } else if (askii >= 97 && askii <= 122) {
                askii += n;
                if (askii > 122) {
                    askii -= 26;
                }
            }
            arr[i] = (char) askii;
            answer += arr[i];

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 4, 3, 2, 1 };
        String returntest = solution.solution("z", 1);
        System.out.println(returntest);

    }

}