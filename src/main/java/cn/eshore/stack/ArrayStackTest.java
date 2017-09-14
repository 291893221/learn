package cn.eshore.stack;

public class ArrayStackTest {
	public static void main(String[] args) {
		ArrayStack<String> arrayStack = new ArrayStack<String>();
		System.out.println(arrayStack.pop());
		arrayStack.push("A");
		arrayStack.push("B");
		arrayStack.push("C");
		arrayStack.push("D");
		arrayStack.push("E");
		arrayStack.push("F");
		System.out.println(arrayStack.isEmpty());
		System.out.println(arrayStack);
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack);
		System.out.println(arrayStack.peek());
		System.out.println(arrayStack);
		arrayStack.reverse();
		System.out.println(arrayStack);
		System.out.println(arrayStack.search("C"));
	}
}
