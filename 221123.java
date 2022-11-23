import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> Ponkemon = new HashSet<Integer>();
        for (int i : nums) {
            Ponkemon.add(i);
        }
        if (nums.length / 2 >= Ponkemon.size()) {
            answer = (Ponkemon.size());
        }
        else {
            answer = (nums.length / 2);
        }
        return answer;
    }

    /* Test case
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        if (2 == solution.solution(nums1)) {
            System.out.println("Success");
        }
        if (3 == solution.solution(nums2)) {
            System.out.println("Success");
        }
        if (2 == solution.solution(nums3)) {
            System.out.println("Success");
        }
    }
    */
}