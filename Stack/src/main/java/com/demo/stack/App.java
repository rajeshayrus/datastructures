package com.demo.stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.length());
        System.out.println(s.peek());
        
        //Reverse String
        System.out.println(reverse("ABCD"));
    }

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		char[] chars = null;
		for(int i = 0; i<s.length();i++) {
			st.push(s.charAt(i));
		}
		for(int i = 0; i<s.length();i++) {
			chars[i]=(Character) st.pop();
		}
		return new String(chars);
	}
}
