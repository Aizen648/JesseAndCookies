package pl;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class JesseAndCookies {
    public static int run(int k, List<Integer> A) {
        int result = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (Integer i : A) {
            if (i < k)
                queue.add(i);
        }
        if (queue.size() == 1) return 1;
        while (queue.size() > 1) {
            if (queue.peek() < k) {
                queue.add(queue.poll() + queue.poll() * 2);
                result++;
            } else break;
        }
        return queue.size() == 1 && queue.poll() < k ? -1 : result;
    }
}
