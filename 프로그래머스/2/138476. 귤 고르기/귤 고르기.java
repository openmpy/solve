import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int item : tangerine) {
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : hm.keySet()) {
            list.add(hm.get(item));
        }
        Collections.sort(list);
        
        int idx = list.size() - 1;
        while (k > 0) {
            k -= list.get(idx);
            idx--;
            answer++;
        }
        return answer;
    }
}