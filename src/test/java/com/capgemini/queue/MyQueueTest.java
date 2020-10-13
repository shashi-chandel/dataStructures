package com.capgemini.queue;

import static org.junit.Assert.*;
import org.junit.Test;
import com.capgemini.linkedlist.MyNode;

public class MyQueueTest {

	@Test
	public void given3Numbers_WhenEnqueued_ShouldHaveAddedToLast() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printQueue();
		assertEquals((int)myThirdNode.getKey(), 70);
	}
	
	@Test
	public void given3Numbers_dequeued_ShouldRemoveFirstNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.dequeue();
		assertEquals((int)myFirstNode.getKey(), 56);
		}

}
