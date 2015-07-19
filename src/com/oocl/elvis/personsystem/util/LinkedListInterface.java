package com.oocl.elvis.personsystem.util;

public interface LinkedListInterface <T>{
	/**
	 *
	 * 取得List的长度
	 * @return List 的长度
	 */
	public int getLength();
	
	/**
	 * 取得List的长度
	 * @param 节点内容，泛型支持
	 */
	public void append(T value);
	
	/**
	 * 列出所有节点的内容
	 */
	public void list();
	
	/**
	 * 按照位置取得节点的内容
	 * @param节点位置
	 * @return 节点内容
	 */
	public T get (int pos);
	/**
	 * 按照位置删除节点
	 * @param节点位置
	 */
	public void delete (int pos);
	/**
	 * 按照位置删除节点
	 * @param节点内容
	 * @return删除是否成功
	 */
	public boolean delete(T t);
	/**
	 * 按照位置替换节点的内容
	 * @param节点内容,节点位置
	 */
	public void replace(T t,int pos);
	/**
	 * 按照位置插入节点
	 * @param节点内容,节点位置
	 */
	public void insert(T t,int pos);
	/**
	 * 按照位置替换节点的内容
	 * @param节点内容
	 * @return节点的位置
	 */
	public int getIndex(T t);
	/**
	 * 搜索是否含有该内容的节点
	 * @param节点内容,
	 * @return是否包含
	 */
	public boolean Contans(T t);
	/**
	 * 删除所有节点
	 */
	public void removeAll();
	
	/**
	 * 选择排序
	 */
	
	public void selectSort();
	/**
	 * 冒泡排序
	 */
	public void bubbleSort();
}
