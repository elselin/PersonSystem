package com.oocl.elvis.personsystem.model.comparator;
/**
 * 字段比较器接口
 * 
 * @param <T> 字段所属的类
 */

public interface FieldComparator<T> {
  /**
   * 比较方法
   * 
   * @param o1 第一个对象
   * @param o2 第二个对象
   * @return 如果第一个对象的指定属性小于第二个对象的指定属性则返回-1，等于返回0，大于返回1
   */
  public int compare(T o1, T o2);
}
