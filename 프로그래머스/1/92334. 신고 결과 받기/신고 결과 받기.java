import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        Map<String, Integer> send = new LinkedHashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            send.put(id_list[i], 0);
        }

        for (int i = 0; i < list.size(); i++) {
            String[] names = list.get(i).split(" ");

            Set<String> set = new HashSet<>();
            if (map.containsKey(names[0])) {
                set = map.get(names[0]);
            }
            set.add(names[1]);
            map.put(names[0], set);

            // 신고 체크
            count.put(names[1], count.getOrDefault(names[1], 0) + 1);
        }

        for (String s : count.keySet()) {
            if (count.get(s) >= k) {
                for (String name : map.keySet()) {
                    if (map.get(name).contains(s)) {
                        send.put(name, send.getOrDefault(name, 0) + 1);
                    }
                }
            }
        }
        
        int[] answer = send.values().stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}