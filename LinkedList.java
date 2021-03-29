package com.linkedlist;

public class LinkedList {

	Node head;
	public void insert(int val) {
	
		Node node = new Node();
		node.val = val;
		if(head == null) {
			head = node;
		}
		else {
			Node tempNode = head;
			while(tempNode.next!=null) {
				tempNode=tempNode.next;
			}
			tempNode.next = node;
		}
	}
	public void display() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}
		
		else {
			Node tempNode = head;
			while(tempNode.next!=null) {
				System.out.print(tempNode.val+" -> ");
				tempNode = tempNode.next;
			}
			System.out.println(tempNode.val);
		}
	}

}
