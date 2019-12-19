package com.practice;

public class RotateList {

	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
			node1.next=node2;
			node2.next=node3;
			node3.next=node4;
			node4.next=node5;
			Node nNode = node1;
			System.out.println("Before rotate");
			while(nNode!=null) {
				System.out.println(nNode.data);
				nNode = nNode.next;
			}
			
		Node rNode = rotateList(node1);
		
		System.out.println("After rotate");
		while(rNode!=null) {
			System.out.println(rNode.data);
			rNode = rNode.next;
		}
		
	}

	private static Node rotateList(Node head) {

		Node temp = head;
		
		int count = 0 ;
		while(count < 3 && temp!=null) {
			temp = temp.next;
			System.out.println("Rotating");
			count++;
		}
		
		if(temp == null) {
			System.out.println("Returned");
			return head;
		}
		
		Node kthNode = temp;
		
		System.out.println("kthNode "+ kthNode.data +" "+kthNode.next);
		while(temp.next!=null) {
			temp = temp.next;
		}
		System.out.println("lastNode "+ temp.data );
		
		temp.next = head;
		
		head = kthNode.next;
		
		kthNode.next=null;

		return head;
	}
	
}



