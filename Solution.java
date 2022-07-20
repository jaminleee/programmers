class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        long answer = solution.solution(3, 5);

        System.out.println(answer);
    }

}