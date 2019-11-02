class Stack1{
	//know something
	int top;
	int size;
	String[] stack;
	
	//does something
	Stack1(){
		top = -1; size = 10;
		stack = new String[size];
	}
	
	void push(String s) {
		if(top == size-1) {
			System.out.println("overflow"); return;
		}
		stack[++top] = s;
	}
	
	void pop() {
		if(top == -1) {
			System.out.println("underflow"); return;
		}
		--top;
	}
	String top() {
		if(isEmpty()) {
			System.out.println("empty");
			return "-1";
		}else
			return stack[top];
	}
	boolean isEmpty() {
		return (top == -1)?true:false;
	}
	void traverse() {
		System.out.print("stack : ");
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println("");
	}
}



public class Stack_Reverse_usingRecursion {
	//know something
	static Stack1 obj = new Stack1();
	//does something
	public static void main(String[] arg) {
		obj.push("4");obj.traverse();
		obj.push("3");obj.traverse();
		obj.push("2");obj.traverse();
		obj.push("1");obj.traverse();
		obj.push("11");obj.traverse();
		reverse(obj);
		obj.traverse();
	}

	//imp : store variable in fun call stack
	private static void reverse(Stack1 obj) {
		if(obj.isEmpty()) {
			return;
		}else {//1.get top element, 2.delete top element, 3.call 1-2 again(i.e. call recursion), 4.insert_at_bottom
			String s = obj.top();//1
			obj.pop();//2
			reverse(obj);//3
			insert_at_bottom(s);
		}
	}

	//store variable in fun call stack
	private static void insert_at_bottom(String s) {
		if(obj.isEmpty()) {
			obj.push(s);
		}else {
			String topStr = obj.top();
			obj.pop();
			insert_at_bottom(s);
			obj.push(topStr);
		}
	}
}
