package com.capgemini.stack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.linkedlist.INode;
import com.capgemini.linkedlist.MyNode;

public class MyStackTest {

	@Test
	public void given3Numbers_WhenAddedToStack_ShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peek();
		myStack.printStack();
		assertEquals(myThirdNode, myNode);
	}

}
