import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        int s = q.size();
        q.offer(x);

        for (int i = 0; i < s; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}