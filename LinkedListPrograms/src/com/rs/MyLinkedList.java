package com.rs;

public class MyLinkedList {
	
	private MyLinkedListNode head;
	
	private MyLinkedListNode tail;
	
	private int size;
	
	public void insertAtFront(String data) {
		MyLinkedListNode newNode = new MyLinkedListNode(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			newNode.setPrev(null);
			head = newNode;		
		}	
		size++;
	}
	
	public boolean delete(String data){
		if (head == null){
			return false;
		}		
		if (head.getNodeValue().equals(data)) {
			head.setNext(head.getNext().getNext());
			head = head.getNext();
			head.setPrev(null);
			return true;
		}
		MyLinkedListNode currentNode = head;
		while (currentNode.getNext() != null) {
			if(currentNode.getNext().getNodeValue().equals(data)){
				currentNode.setNext(currentNode.getNext().getNext());
				currentNode.getNext().setPrev(currentNode);
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
	
	public String kToLastElement(int k) {
		MyLinkedListNode currentNode = head;		
		for (int i = 0;  i <= k; i++) {
			if (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			} else {
				return null;
			}			
		}
		MyLinkedListNode kToLast = head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			kToLast = kToLast.getNext();
		}
		return kToLast.getNodeValue();
	}

	public MyLinkedListNode getHead() {
		return head;
	}

	public void setHead(MyLinkedListNode head) {
		this.head = head;
	}

	public MyLinkedListNode getTail() {
		return tail;
	}

	public void setTail(MyLinkedListNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void addChild(MyLinkedList myLinkedList) {		
		head.setChild(myLinkedList.getHead());
	}

}
