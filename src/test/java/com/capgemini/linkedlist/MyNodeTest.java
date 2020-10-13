package com.capgemini.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	@Test
	public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

}
