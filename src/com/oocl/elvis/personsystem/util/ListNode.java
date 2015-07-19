package com.oocl.elvis.personsystem.util;


public class ListNode <T>{
    
	 	T value;                      

	    ListNode<T> next;
	    
	    public ListNode()
	    {
	        this.value = null;
	        next=null;
	    }
	    
	    public ListNode(T value,ListNode<T> n)
	    {
	        this.value = value;
	        next=n;
	    }

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public ListNode<T> getNext() {
			return next;
		}

		public void setNext(ListNode<T> next) {
			this.next = next;
		}

		
}