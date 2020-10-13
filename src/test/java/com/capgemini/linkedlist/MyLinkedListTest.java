package com.capgemini.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenAppendedToLinkedList_ShouldBeAppendedToLast() {
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenInsertingSecondNumber_ShouldBeAfterFirstAndBeforeThird() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void given3Numbers_WhenPopping_ShouldRemoveFirstNumber() {
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		MyNode<Integer> pop = (MyNode<Integer>) myLinkedList.pop();
		assertEquals(mySecondNode, pop);
		myLinkedList.printMyNodes();
	}

	@Test
	public void given3Numbers_WhenPopLast_ShouldRemoveLastNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> popLast = (MyNode<Integer>) myLinkedList.popLast();
		myLinkedList.printMyNodes();
		assertEquals(myThirdNode, popLast);
	}

	@Test
	public void given3Numbers_WhenSearching_ShouldReturnThatNumber() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> search = (MyNode<Integer>) myLinkedList.search(30);
		assertEquals(mySecondNode, search);
	}

	@Test
	public void given3Numbers_WhenInserting4th_ShouldInsertAtCorrectPosition() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(40);
		MyNode<Integer> searchAndInsert = (MyNode<Integer>) myLinkedList.searchAndInsert(30, myFourthNode);
		myLinkedList.printMyNodes();
		assertEquals(mySecondNode, searchAndInsert);
	}
}
