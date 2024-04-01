package com.stack;

import java.util.Stack;

public class MethodsOfStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("bhuvi");
		s.push(56);
		s.push(890.89);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("bhuvi"));//first index is last print
	}

}
