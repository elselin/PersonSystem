package com.oocl.elvis.personsystem.model;

public interface LinkedListInterface <T>{
	
	public int getLength();
	public void append(T value);
	public void list();
	public T get (int pos);
	public void delete (int pos);
	public boolean delete(T t);
	public void replace(T t,int pos);
	public void insert(T t,int pos);
	public int getIndex(T t);
	public boolean Contans(T t);
	public void removeAll();
	public void selectSort();
	public void bubbleSort();
}
