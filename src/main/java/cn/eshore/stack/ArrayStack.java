package cn.eshore.stack;

import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("unchecked")
public class ArrayStack<T> implements Stack<T> {

	// 用数组进行存储
	private T[] array;

	// 游标
	private int index = 0;

	// 构造函数
	public ArrayStack() {
		super();
		array = (T[]) new Object[3];
	}

	public int size() {
		return index;
	}

	public void push(T t) {
		// 判断数组是否越界
		if (index >= array.length) {
			// 数组扩容
			array = Arrays.copyOf(array, index + index / 2);
		}

		array[index++] = t;
	}

	public T pop() {
		// 判断堆栈是否为空
		if (isEmpty()) {
			return null;
		}
		T t = array[--index];
		array[index] = null;
		return t;
	}

	public T peek() {
		// 判断堆栈是否为空
		if (isEmpty()) {
			return null;
		}
		return array[index - 1];
	}

	public Boolean isEmpty() {
		return index == 0;
	}

	public int search(T t) {
		// 判断堆栈是否为空
		if (isEmpty()) {
			return -1;
		}
		for (int i = 0; i < index; i++) {
			T ti = array[i];
			if (t.equals(ti)) {
				return i;
			}
		}
		return -1;
	}

	public void reverse() {
		// 判断堆栈是否为空
		if (isEmpty()) {
			return;
		}
		array = Arrays.copyOf(array, index);
		Collections.reverse(Arrays.asList(array));
	}

	@Override
	public String toString() {
		String rs = "";
		// 判断堆栈是否为空
		if (isEmpty()) {
			return "[ ]";
		}
		for (int i = 0; i < index; i++) {
			T t = array[i];
			rs += ", " + t.toString();
		}
		rs = rs.replaceFirst(",", "[");
		rs += " ]";
		return rs;
	}
}
