package com.oocl.elvis.personsystem.model.comparator;
/**
 * �ֶαȽ����ӿ�
 * 
 * @param <T> �ֶ���������
 */

public interface FieldComparator<T> {
  /**
   * �ȽϷ���
   * 
   * @param o1 ��һ������
   * @param o2 �ڶ�������
   * @return �����һ�������ָ������С�ڵڶ��������ָ�������򷵻�-1�����ڷ���0�����ڷ���1
   */
  public int compare(T o1, T o2);
}
