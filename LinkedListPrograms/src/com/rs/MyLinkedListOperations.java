package com.rs;

public class MyLinkedListOperations {
	
	public static void flattenList(MyLinkedList myLinkedList) {
		MyLinkedListNode currentNode = myLinkedList.getHead();		
		
		while (currentNode != null) {
			if (currentNode.getChild() != null) {
				myLinkedList.setTail(append(currentNode.getChild(), myLinkedList.getTail()));
			}
			currentNode = currentNode.getNext();
		}
		
	}
	
	private static MyLinkedListNode append(MyLinkedListNode currentNode, MyLinkedListNode tail) {
		tail.setNext(currentNode);
		currentNode.setPrev(tail);
				
		for (; currentNode.getNext() != null; currentNode = currentNode.getNext()) {} 
			
		return currentNode;
	}
	
	public static void printList (MyLinkedList myLinkedList) {
		MyLinkedListNode currentNode = myLinkedList.getHead();		
		
		while (currentNode != null) {
			System.out.println(currentNode.getNodeValue());
			currentNode = currentNode.getNext();
		}		
	}

}
