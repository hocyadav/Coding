/**
 * 
 * @author Hariom Yadav - Nov 3, 2019
 *Stack_reverse_using_recursion_TRY - how to think for recursion function 2 times- before writing and when we calling
 */
public class Stack_reverse_using_recursion_TRY {
	static Stack obj = new Stack();//from - Revise_integer_using_1stack_impl.java
	public static void main(String[] args) {
		reverse();obj.print();
		obj.push(1);obj.print();
		obj.push(2);obj.print();
		obj.push(3);obj.print();
		obj.push(4);obj.print();
		reverse();obj.print();
	}

	//before writing recursion - think of current stack picture in mind 
	//- think big size stack not empty , since empty will take care below recursion func
	
	//take top
	//delete top
	//call fun call stack
	//insert at bottom
	private static void reverse() {
		if(obj.isEmpty()) {
			return;//simple return - that means we are using FCS values for other purpose
		}else {
			int x = obj.top();
			obj.pop();
			reverse();//func call stack - think top "fun call stack" value --> bottom stack value 
			insert_at_bottom_ofStack(x);//my logic - insert all top of funCallStack value bototm of main stack
		}
	}

	//before writing recursion - think big picture - stack big picture, top : 1,2,3,4
	private static void insert_at_bottom_ofStack(int x) {
		if(obj.isEmpty()) {
			obj.push(x);
		}else {
			int v = obj.top();
			obj.pop();
			insert_at_bottom_ofStack(x);//"fun call stack" above value : bottom value at top of FCS
			//after above line we have bottom stack value - and that is store in FCS variable
			obj.push(v);
		}
	}
}
