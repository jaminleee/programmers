class Solution {
    public int solution(int n) {
        int answer = 0;
        for (answer = 2; answer < n; answer++) {
            if (n % answer == 1) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 5 } };
        int[] arr = { 4, 3, 2, 1 };
        int[][] returntest = solution.solution(arr1, arr2);
        System.out.println(returntest[0][0]);

    }

}