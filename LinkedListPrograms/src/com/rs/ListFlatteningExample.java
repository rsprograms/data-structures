package com.rs;

public class ListFlatteningExample {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insertAtFront("5");
		myLinkedList.insertAtFront("4");
		
		MyLinkedList myLinkedList21 = new MyLinkedList();
		myLinkedList21.insertAtFront("10");
		myLinkedList21.insertAtFront("9");
		
		MyLinkedList myLinkedList31 = new MyLinkedList();
		myLinkedList31.insertAtFront("14");
		myLinkedList31.insertAtFront("13");
		
		MyLinkedList myLinkedList41 = new MyLinkedList();
		myLinkedList41.insertAtFront("17");
		myLinkedList41.insertAtFront("16");
		
		myLinkedList31.addChild(myLinkedList41);
		myLinkedList21.addChild(myLinkedList31);
		myLinkedList.addChild(myLinkedList21);
		
		myLinkedList.insertAtFront("3");
		myLinkedList.insertAtFront("2");
		myLinkedList.insertAtFront("1");
		
		MyLinkedList myLinkedList22 = new MyLinkedList();
		myLinkedList22.insertAtFront("8");		
		
		MyLinkedList myLinkedList32 = new MyLinkedList();
		myLinkedList32.insertAtFront("12");
		
		MyLinkedList myLinkedList42 = new MyLinkedList();
		myLinkedList42.insertAtFront("15");
		
		myLinkedList32.addChild(myLinkedList42);
		myLinkedList22.addChild(myLinkedList32);		
						
		myLinkedList22.insertAtFront("7");
		
		MyLinkedList myLinkedList33 = new MyLinkedList();
		myLinkedList33.insertAtFront("11");
		
		myLinkedList22.addChild(myLinkedList33);
		
		myLinkedList22.insertAtFront("6");
				
		myLinkedList.addChild(myLinkedList22);
		
		MyLinkedListOperations.flattenList(myLinkedList);
		
		MyLinkedListOperations.printList(myLinkedList);

	}

}
