package com.oocl.elvis.personsystem.util;

public interface LinkedListInterface <T>{
	/**
	 *
	 * ȡ��List�ĳ���
	 * @return List �ĳ���
	 */
	public int getLength();
	
	/**
	 * ȡ��List�ĳ���
	 * @param �ڵ����ݣ�����֧��
	 */
	public void append(T value);
	
	/**
	 * �г����нڵ������
	 */
	public void list();
	
	/**
	 * ����λ��ȡ�ýڵ������
	 * @param�ڵ�λ��
	 * @return �ڵ�����
	 */
	public T get (int pos);
	/**
	 * ����λ��ɾ���ڵ�
	 * @param�ڵ�λ��
	 */
	public void delete (int pos);
	/**
	 * ����λ��ɾ���ڵ�
	 * @param�ڵ�����
	 * @returnɾ���Ƿ�ɹ�
	 */
	public boolean delete(T t);
	/**
	 * ����λ���滻�ڵ������
	 * @param�ڵ�����,�ڵ�λ��
	 */
	public void replace(T t,int pos);
	/**
	 * ����λ�ò���ڵ�
	 * @param�ڵ�����,�ڵ�λ��
	 */
	public void insert(T t,int pos);
	/**
	 * ����λ���滻�ڵ������
	 * @param�ڵ�����
	 * @return�ڵ��λ��
	 */
	public int getIndex(T t);
	/**
	 * �����Ƿ��и����ݵĽڵ�
	 * @param�ڵ�����,
	 * @return�Ƿ����
	 */
	public boolean Contans(T t);
	/**
	 * ɾ�����нڵ�
	 */
	public void removeAll();
	
	/**
	 * ѡ������
	 */
	
	public void selectSort();
	/**
	 * ð������
	 */
	public void bubbleSort();
}
