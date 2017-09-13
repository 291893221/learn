package cn.eshore.stack;

public interface Stack<T> {
	//入栈
	public void push(T t);
	//出栈
	public T pop();
	//检查栈顶元素
	public T peek();
	//检查栈是否为空
	public Boolean isEmpty();
    //查找栈内是否存在元素t，如果存在返还元素的位置（相对于栈顶），否则返还-1
	public int search(T t);
	//反转栈内元素
	public void reverse();
}