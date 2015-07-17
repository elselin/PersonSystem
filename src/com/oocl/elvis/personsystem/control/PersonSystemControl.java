package com.oocl.elvis.personsystem.control;

public interface PersonSystemControl {
	
	public void list();
	public boolean list(String commad);
	public boolean delete(String commad);
	public boolean find(String commad);
	public boolean sort(String commad);
	public boolean add(String p);
	
}
