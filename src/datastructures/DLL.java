package datastructures;

import datastructures.LL;

public class DLL {
	
	Node head;
	private int size;
	
	public DLL() {
		this.size=0;
	}
	
	public void insertFirst(int val) {
		
		Node node= new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;	
		}
		head=node;
		size++;
	}
	
	public void insertLast(int val) {
		Node node= new Node(val);
		Node last = head;
		node.next=null;
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		
		while(last.next!=null) {
			
			last=last.next;
		}
		
		last.next=node;
		node.prev=last;
		size++;
		
	}
	
	public void insertAftervalue(int number, int val) {
		
		Node node = new Node(val);
		Node temp=head;
		while(temp.val!=number) {
			if(temp.next==null) {
				System.out.println("not found");
				return;
			}
			temp=temp.next;
			
		}
		node.next=temp.next;
		node.prev=temp;
		temp.next.prev=node;
		temp.next=node;
		size++;
		
		
	}
	
	public void insertAfter(int number, int val) {
		Node p =find(number);
		if(p==null) {
			System.out.println("not found");
			return;
		}
		
		Node node= new Node(val);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		
		if(node.next!=null) {
			node.next.prev=node;
		}
		size++;
		
	}
	
	public Node find(int value) {
		
		Node node=head;
		while(node!=null) {
			if(node.val==value) {
				return node;
			}
			node=node.next;
		}
		
		return null;
	}
	
	public void display() {
		Node node=head;
		Node last =null;
		while(node!=null) {
			System.out.print(node.val+" -> ");
			last=node;
			node=node.next;
		} 
		System.out.print("END");
		System.out.println("");
//		System.out.println("printing in reverse order");
		
		
		while(last!=null) {
//			System.out.print(last.val+" -> ");
			last=last.prev;
		}
//		System.out.print("START");
	}
	
	public int deleteFirst() {
		
		if(head==null) {
			System.out.println("no elemenst to delete");
			
		}
		int value=head.val;
		head=head.next;
		size--;
		return value;
		
	}
	
	public int deleteLast() {
		if(head==null) {
			System.out.println("no elements to delte");
			
		}
		Node last= head;
		while(last.next!=null) {
			last=last.next;
		}
		int val=last.val;
		last.prev.next=null;
		size--;
		return val;
	}

	
	public int delete(int index) {

		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		
		Node node=head;
		for(int i=0;i<index-1;i++) {
			node =node.next;
		}
		int val=node.next.val;
		node.next=node.next.next;
		node.next.prev=node;
		
		return val;
		
		
	}
	private class Node{
		private int val;
		private Node next;
		private Node prev;
		
		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
		
	}


	
	

}
