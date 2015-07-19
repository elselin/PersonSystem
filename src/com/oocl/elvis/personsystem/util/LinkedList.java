package com.oocl.elvis.personsystem.util;

public class LinkedList<T> implements LinkedListInterface<T> {

	ListNode<T> head;

	ListNode<T> nodePointer = new ListNode<T>(null, head);

	public LinkedList() {
		head = new ListNode<T>();
	}

	public LinkedList(ListNode<T> n) {
		head = new ListNode<T>(null, n);
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		int len = 0;
		nodePointer = head.next;
		while (nodePointer != null) {
			len++;
			nodePointer = nodePointer.next;
		}
		return len;
	}

	@Override
	public void append(T value) {
		// TODO Auto-generated method stub
		ListNode<T> newNode = new ListNode<T>(value, null);
		if (head.next == null) {
			head.next = newNode;
			return;
		}
		nodePointer = head.next;
		while (nodePointer.next != null) {
			nodePointer = nodePointer.next;
		}
		nodePointer.next = newNode;
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		nodePointer = head.next;
		while (nodePointer.next != null) {
			System.out.println(nodePointer.value.toString());
			nodePointer = nodePointer.next;
		}
		System.out.println(nodePointer.value.toString());
	}

	@Override
	public T get(int pos) {
		// TODO Auto-generated method stub
		int i = 0;
		nodePointer = head.next;
		while (nodePointer!= null) {
			if (i++ == pos) {
				return nodePointer.value;
			}
			nodePointer = nodePointer.next;
		}
		return null;
	}

	@Override
	public void delete(int pos) {
		// TODO Auto-generated method stub
		int i = 0;
		ListNode<T> pre = new ListNode<T>();
		if(pos==0){
			head.next = head.next.next;
			return;
		}
		nodePointer = head.next;
		while (nodePointer!= null) {
			if (i++ == pos) {
				pre.next = nodePointer.next;
			}
			pre = nodePointer;
			nodePointer = nodePointer.next;
		}		
	}

	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		// 泛型之间的比�?
		ListNode<T> pre = new ListNode<T>();
		nodePointer = head.next;
		while (nodePointer!= null) {
			if (t.toString().equals(nodePointer.value.toString())) {
				pre = nodePointer;
				nodePointer = nodePointer.next;
				return true;
			}
			pre.next = nodePointer.next;
		}
		return false;
	}

	@Override
	public void replace(T t, int pos) {
		// TODO Auto-generated method stub
		int i = 0;
		nodePointer = head.next;
		while (nodePointer!= null) {
			if (i++ == pos) {
				nodePointer.value = t;
				break;
			}
			nodePointer = nodePointer.next;
		}
	}

	@Override
	public void insert(T t, int pos) {
		// TODO Auto-generated method stub
		int i = 0;
		ListNode<T> pre = new ListNode<T>();
		ListNode<T> newNode = new ListNode<T>(t, null);
		nodePointer = head.next;
		while (nodePointer.next != null) {
			if (i++ == pos) {
				newNode.next = pre.next;
				pre.next = newNode;
			}
			pre = nodePointer;
			nodePointer = nodePointer.next;
		}
	}

	@Override
	public int getIndex(T t) {
		int pos = 0;
		nodePointer = head.next;
		while (nodePointer.next != null) {
			if (t.toString().equals(nodePointer.value.toString())) {
				nodePointer = nodePointer.next;
				return pos;
			}
			pos++;
			nodePointer = nodePointer.next;
		}
		return 0;
	}

	@Override
	public boolean Contans(T t) {
		// TODO Auto-generated method stub
		nodePointer = head.next;
		while (nodePointer.next != null) {
			if (t.toString() == nodePointer.value.toString()) {
				nodePointer = nodePointer.next;
				return true;
			}
			nodePointer = nodePointer.next;
		}
		return false;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		nodePointer = head.next;
		ListNode<T> pre;
		while (nodePointer.next != null) {
			pre = nodePointer;
			nodePointer = nodePointer.next;
			pre.next = null;
		}
		head.next = null;
	}

	@Override
	public void selectSort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bubbleSort() {

	}

}