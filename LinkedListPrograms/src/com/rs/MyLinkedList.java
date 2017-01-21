package com.rs;

public class MyLinkedList {
	
	private MyLinkedListNode head;
	
	private MyLinkedListNode tail;
	
	private int size;
	
	public boolean insertAtFront(String data) {
		MyLinkedListNode newNode = new MyLinkedListNode(data);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			newNode.setNext(head);
			head = newNode;
			return true;
		}		
	}
	
	public boolean delete(String data){
		if (head == null){
			return false;
		}		
		if (head.getNodeValue().equals(data)) {
			head.setNext(head.getNext().getNext());
			return true;
		}
		MyLinkedListNode currentNode = head;
		while (currentNode.getNext() != null) {
			if(currentNode.getNext().getNodeValue().equals(data)){
				currentNode.setNext(currentNode.getNext().getNext());
				return true;
			}
			else {
				currentNode = currentNode.getNext();
			}
		}
		return false;
	}
	
	public MyLinkedListNode find(String data){
		MyLinkedListNode currentNode = head;
		while (currentNode != null && !(currentNode.getNodeValue().equals(data))) {
			currentNode = currentNode.getNext();
		}		
		return currentNode;
	}

}
