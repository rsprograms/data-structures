package com.rs;

public class MyLinkedListNode {
	
	private MyLinkedListNode prev;
	
	private MyLinkedListNode next;
	
	private String nodeValue;
	
	MyLinkedListNode(String data) {
		nodeValue = data;
	}

	public MyLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(MyLinkedListNode prev) {
		this.prev = prev;
	}

	public MyLinkedListNode getNext() {
		return next;
	}

	public void setNext(MyLinkedListNode next) {
		this.next = next;
	}

	public String getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(String nodeValue) {
		this.nodeValue = nodeValue;
	}
	
	

}
