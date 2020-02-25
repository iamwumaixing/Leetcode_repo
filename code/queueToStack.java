/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

import java.util.Stack;

public class Solution {
    // Stack是先入后出的，Queue是先入先出的
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    // 先入stack1,如果stack2为空，取出stack1入stack2
    public void push(int node) {
        stack1.push(node);
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    
    // 从stack2中pop，如果stack2为空，将stack1入stack2后pop
    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}