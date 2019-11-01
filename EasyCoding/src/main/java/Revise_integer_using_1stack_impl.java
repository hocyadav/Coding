/**
 * 
 * @author Hariom Yadav - Nov 1, 2019
 *
 */

//data structure
class Stack{
	//knows something
	int top;
	int stackSize;
	int[] stack;
	
	//does something
	Stack(){
		top = -1;
		stackSize = 10;
		stack = new int[stackSize];
	}
	
	void push(int x) {
		if(top == stackSize -1) return;
		stack[++top] = x;
	}
	void pop(){
		if(top == -1) {
			System.out.println("underflow");
			return;
		}
		top--;
	}
	int top() {
		return (top == -1)?-1:stack[top];
	}
	boolean isEmpty() {
		return (top == -1)?true:false;
	}
	void print() {
		System.out.print("stack : ");
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println("");
	}
	
}

public class Revise_integer_using_1stack_impl {
	//class knows somethinsg
	//m1
	static Stack obj = new Stack();
	//m2 Stack<Integer> obj = new Stack<>();
	
	//class does something
	public static void main(String[] args) {
		int val = 123456;
		int result = reverse(val);
		System.out.println(result);
	}
	
	static int reverse(int val) {
		//1 reverse digit and and store in stack
		//2. pop
		
		stack_reverse(val);
		int reverse = 0;
		int d=1;
		while(!obj.isEmpty()) {
			reverse = reverse + (obj.top()*d);
			obj.pop();
			d = d*10;
		}
		
		return reverse;
	}
	static void stack_reverse(int value){
		int temp = value;
		while(temp != 0) {
			//1st digit and push
			obj.push(temp % 10);
			temp = temp/10;// divide will give remove last digit 
		}
	}
	

}
