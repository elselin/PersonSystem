package com.oocl.elvis.personsystem.control;

public interface PersonSystemControl {
	
	public void list();
	public boolean list(String command);
	public boolean delete(String command);
	public boolean find(String command);
	public boolean sort(String command);
	public boolean add(String p);
	
}
