class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if (phone_number.length() > 4) {
            String last4 = phone_number.substring(phone_number.length()-4, phone_number.length());
            System.out.println(last4);
            String cen = phone_number.substring(0, phone_number.length()-4);
            cen = "*".repeat(cen.length());

            answer = cen + last4;
            
            return answer;
        }
        else {
            return phone_number;
        }
    }
//Test Case
  /* 
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("01033334444");
    }
}
*/
