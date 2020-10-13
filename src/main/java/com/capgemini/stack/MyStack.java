package com.capgemini.stack;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.MyLinkedList;

public class MyStack {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peek() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
