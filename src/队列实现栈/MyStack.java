package 队列实现栈;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用队列实现栈的push、pop、top、empty操作。
 * @author IzumiSakai
 */
public class MyStack {
    private List<Integer> queue = new ArrayList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(0,x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.remove(0);
    }

    /** Get the top element. */
    public int top() {
        return queue.get(0);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
