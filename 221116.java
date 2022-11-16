class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a, b);
        long max = Math.max(a, b);

        answer = ((max + min) * (max - min + 1)) / 2;

        return answer;
    }

    /* Test Case
    public static void main(String[] args) {
        Solution solution = new Solution();
        if (12 == solution.solution(3, 5)) {
            System.out.println("Success");
        }
        if (3 == solution.solution(3, 3)) {
            System.out.println("Success");
        }
        if (12 == solution.solution(5, 3)) {
            System.out.println("Success");
        }
    }
    */
}
