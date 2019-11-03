/**
 * 
 * @author Hariom Yadav - Nov 3, 2019
 *
 */
public class Stack_insert_given_element_at_bottom {
	static Stack obj = new Stack();//using Stack from - Revise_integer_using_1stack_impl.java
	public static void main(String[] args) {
		obj.push(1);obj.print();//Push is nothing but insert at top
		obj.push(2);obj.print();
		obj.push(3);obj.print();
		obj.push(4);obj.print();
		insert_at_bottom(5);obj.print();
	}
	
	static void insert_at_bottom(int value) {
		if(obj.isEmpty()) {
			obj.push(value);
		}else {
			int topValue = obj.top();
			obj.pop();
			insert_at_bottom(value);
			obj.push(topValue);			
		}
	}
	
}
