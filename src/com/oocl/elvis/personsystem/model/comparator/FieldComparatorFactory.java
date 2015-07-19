package com.oocl.elvis.personsystem.model.comparator;

/**
 * 字段比较器工厂
 * 
 * @param <T> 字段所属类
 */
public interface FieldComparatorFactory<T> {

	  /**
	   * 通过字段名返回比较器
	   * 
	   * @param fieldName 字段名
	   * @return 返回字段比较器
	   */
  public FieldComparator<T> getFieldComparator(String fieldName);
}
