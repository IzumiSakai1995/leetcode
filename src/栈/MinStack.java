package 栈;
/**
* 155.
* 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
* */
public class MinStack {
    private Object[] stackElem;
    private int top;
    public MinStack(int maxSize){
        stackElem = new Object[maxSize];
        top = 0;
    }

    public void push(){

    }

    public void pop() throws Exception {
        if (top==0){
            throw new Exception("栈为空");
        }else{
            // 删除栈顶并设置新栈顶
            stackElem = (Object[]) stackElem[--top];
        }
    }

//    public int top(){
//
//    }
//
//    public int getMin(){
//
//    }
}
