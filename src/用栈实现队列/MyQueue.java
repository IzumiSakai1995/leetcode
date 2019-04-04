package 用栈实现队列;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
* @author IzumiSakai
* @desc Implement the following operations of a queue using stacks
 * push(x) Push the x to back of queue
 * pop() Removes the element from in front of queue   移除队首
 * peek() get the front element     返回队首
 * empty() Return whether the queue is empty
 * Notes:
 *      Using only standard operations of stack --> push to top , peek/pop from top,size, and is empty operations are valid
 *
 *      假设所有的操作都是有效的（列如，一个空队列不会调用pop或者peek操作）
 *
 *
* */
public class MyQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    public MyQueue(){

    }

/*    private void push(int x){
        this.s1.push(x);
    }*/

    private void push(int x){
        while (!s2.isEmpty()) {s1.push(s2.pop());}
        s2.push(x);
        while (!s1.isEmpty()) {s2.push(s1.pop());}


    }

    private int pop(){
        if (s2.isEmpty()){
            return -1;
        }
            return s2.pop();
    }
        public int peek() {
            if (s2.isEmpty()){
                return -1;
            }
            return s2.peek();
        }

    private boolean empty(){
        return s2.isEmpty();
    }
    @Test
    public void test(){
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        queue.push(3);
        System.out.println(queue.peek());
    }
}

