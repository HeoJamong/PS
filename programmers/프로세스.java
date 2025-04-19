import java.util.*;

class Solution {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : priorities) {
            pq.add(i);
        }
        
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    pq.remove();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
      
        return answer;
    }
}
