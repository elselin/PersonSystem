package com.oocl.elvis.personsystem.model.comparator;

/**
 * �ֶαȽ�������
 * 
 * @param <T> �ֶ�������
 */
public interface FieldComparatorFactory<T> {

	  /**
	   * ͨ���ֶ������رȽ���
	   * 
	   * @param fieldName �ֶ���
	   * @return �����ֶαȽ���
	   */
  public FieldComparator<T> getFieldComparator(String fieldName);
}
