package com.oocl.elvis.personsystem.model;


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
}