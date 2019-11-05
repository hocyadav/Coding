package coding1;

import java.util.*;

//ds
//stack using java collection 

//test ds
public class Stack_reverse_String {
	public static void main(String[] arg) {
		StringBuffer sb = new StringBuffer("HariomYadav");
		reverse(sb);
		System.out.println(sb);
		
	}

	private static void reverse(StringBuffer str) {
		//push all char in stack
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			st.push(str.charAt(i));
		}
		
		//pull all char from stack
		for(int j=0; j<str.length(); j++) {
			str.setCharAt(j, st.pop());
		}
	}
}
