class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int index = len / 2;
        if (len % 2 == 0) {
            answer = s.substring(index - 1, index + 1);
        } else {
            answer = s.substring(index, index + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        int[] arr = { 4, 3, 2, 1 };
        String answer = solution.solution("qswer");
        System.out.println(answer);

    }

}