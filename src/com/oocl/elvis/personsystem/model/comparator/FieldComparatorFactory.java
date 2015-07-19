package com.oocl.elvis.personsystem.model.comparator;


public interface FieldComparatorFactory<T> {
	/*
	 * a method in...
	 */
  public FieldComparator<T> getFieldComparator(String fieldName);
}
