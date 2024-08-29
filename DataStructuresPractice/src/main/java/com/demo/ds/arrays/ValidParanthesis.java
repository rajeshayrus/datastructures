package com.demo.ds.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*ValidParanthesis
 * 
 * Stack data structure
 * 
 * */


public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(])";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		List<Character> l = Arrays.asList('(', '{', '[');
		// Can use enum as well to store paranthesis pair
		st.push(ch[0]);
		for (int i = 1; i< s.length(); i++) {
			if (l.contains(ch[i])) 
				st.push(ch[i]);
			else {
				
				if (st.isEmpty() || !l.contains(st.peek()))
					return false;
				char top = st.peek();
				if (ch[i] == ')' && top == '(' || ch[i] == '}' && top == '{' || ch[i] == ']' && top == '[')
					st.pop();
				else {
					return false;
				}
			}
				
		}
		
		return st.isEmpty();

	}
	
	public static boolean isValid1(String s) {
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		List<Character> l = Arrays.asList('(', '{', '[');
		for (int i = 0; i< s.length(); i++) {
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') 
				st.push(ch[i]);
			else {
				char top = st.peek();
				if (ch[i] == ')' && top == '(' || ch[i] == '}' && top == '{' || ch[i] == ']' && top == '[')
					st.pop();
			}
				
		}
		
		return st.isEmpty();

	}

}
