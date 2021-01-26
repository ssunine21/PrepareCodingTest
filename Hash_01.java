import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(String par : participant) 
            hashMap.put(par, hashMap.getOrDefault(par, 0) + 1);
        
        for(String com : completion)
                hashMap.put(com, hashMap.get(com) - 1);
        
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() == 1) {
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}