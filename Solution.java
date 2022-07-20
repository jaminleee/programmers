class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int index = 0;
        int len = arr.length;
        int min = arr[0];
        if (len == 1) {
            answer[0] = -1;
        } else {
            for (int i = 1; i < len; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    index = i;
                }
            }
            for (int i = index; i < len; i++) {
                answer[i] = arr[i + 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        int[] arr = { 4, 3, 2, 1 };
        int[] answer = solution.solution(arr);
        System.out.println(arr[0]);

    }

}