package com.oocl.elvis.util;
/*
 * compare person  attribute
 */
public interface PersonComparable<T> extends Comparable<T>{
	public int compareTo(T t,String a);
}
