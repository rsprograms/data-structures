package com.rs;

public class MyLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insertAtFront("1");
		myLinkedList.insertAtFront("2");
		myLinkedList.insertAtFront("3");
		myLinkedList.insertAtFront("4");
		myLinkedList.insertAtFront("5");
		if (myLinkedList.find("3") != null) {
			System.out.println(myLinkedList.find("3").getNodeValue());
		} else {
			System.out.println("Not Found");
		}
		myLinkedList.delete("3");
		if (myLinkedList.find("3") != null) {
			System.out.println(myLinkedList.find("3").getNodeValue());
		} else {
			System.out.println("Not Found");
		}
	}

}
