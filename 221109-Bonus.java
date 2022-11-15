import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Set<String> setComp = new HashSet<String>();
        for (String names: completion) {
            setComp.add(names);
        }

        for (String part: participant) {
            if (!setComp.contains(part)){
                answer = part;
            }
        }
        return answer;
    }
    //could not find answer for the same names
}