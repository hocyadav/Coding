/**
 * 
 * @author Hariom Yadav - Nov 1, 2019
 * find max element at any time in a stack in O(1) time and with 1 stack
 * https://www.geeksforgeeks.org/find-maximum-in-stack-in-o1-without-using-additional-stack/
 */

class Block{
	int value;
	int maxValue;
}

class MaxStack1{
	//know something
	int top;
	int size;
	Block[] stack_obj;
	
	//does something
	public MaxStack1() {//memory allocate
		top = -1;
		size = 10;
		stack_obj = new Block[size];
		for(int i=0; i<size;i++) {
			stack_obj[i] = new Block();
		}
	}
	
	void push(int v) {
		if(top == size-1) {
			System.out.println("overflow");
			return;
		}
		++top;
		stack_obj[top].value = v;
		if(top == 0) {
			stack_obj[top].maxValue = v;
		}else {
			if(v > stack_obj[top-1].maxValue) {
				stack_obj[top].maxValue = v;
			}else {
				stack_obj[top].maxValue = stack_obj[top-1].maxValue;
			}
		}
	}
	
	void pop() {
		if(top == -1) {
			System.out.println("underflow");
			return;
		}
		--top;
	}
	int top() {
		return (top == -1)?-1:stack_obj[top].value;
	}
	boolean isEmpty() {
		return (top == -1)?true:false;
	}
	int max() {
		if(top == -1) {
			System.out.println("underflow : no max");
			return -1;
		}
		return stack_obj[top].maxValue;
	}
	void print() {
		System.out.print("Stack : ");
		for(int i=0; i<=top; i++) {
			System.out.print(stack_obj[i].value+" ");
		}
		System.out.println("");
	}
	
}

public class MaxElementIn1Stack {

	public static void main(String[] args) {
		MaxStack1 obj = new MaxStack1();
		System.out.println(obj.max());
		obj.push(12);obj.print();
		obj.push(1);obj.print();
		System.out.println(obj.max());
		obj.pop();obj.print();
		obj.pop();obj.print();
		obj.pop();obj.print();
		System.out.println(obj.max());
		
		

	}

}
