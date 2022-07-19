
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;
        for (int i = 0; i < len; i++) {
            if (signs[i] == false) {
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes = { 4, 7, 12 };
        boolean[] signs = { true, false, true };
        int answer = solution.solution(absolutes, signs);
        // if (answer = true) {
        // System.out.println("true");
        // } else {
        // System.out.println(false);
        // }
        System.out.println(answer);
    }

}