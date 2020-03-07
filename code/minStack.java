/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */

public class Solution {
    // 申请一个辅助栈，存放最小元素
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void push(int node) {
        // 入栈时，辅助栈的栈顶如果大于等于这个数，则两边都入
        if (!s1.empty()) {
            if (s1.peek() >= node) s1.push(node);
        } else {
            s1.push(node);
        }
        s2.push(node);
    }
    
    public void pop() {
        int num = s2.pop();
        if (s1.peek() == num) {
            s1.pop();
        }
    }
    
    public int top() {
        return s2.peek();
    }
    
    public int min() {
        return s1.peek();
    }
}