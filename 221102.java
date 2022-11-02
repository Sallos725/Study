import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for (int i = 0; i < num; i ++) {
            if (num % 2 == 1) {
                answer[num/2] = total/num;
                int k = total/num;
                int j = (num/2);
                while (j > -1) {
                    answer[j] = k--;
                    j--;
                }
                int l = total/num;
                int m = (num/2);
                while (m < num) {
                    answer[m] = l++;
                    m++;
                }
            }
            else {
                answer[num/2 - 1] = total/num;
                answer[num/2] = total/num;
                int k = total/num;
                int j = (num/2-1);
                while (j > -1) {
                    answer[j] = k--;
                    j--;
                }
                int l = total/num;
                int m = (num/2-1);
                while (m < num) {
                    answer[m] = l++;
                    m++;
                }
            }

        }
        return answer;
    }

    /* Test Case
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(3, 12)));
    }
    */
}
