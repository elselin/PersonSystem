package com.oocl.elvis.personsystem.control;

public interface PersonSystemControl {
	
	/**
	 * �г�Person Bean List �����е�����
	 */
	public void list();
	/**
	 * ��ָ���еĲ��������¼ row / row begin-end begin
	 * @param commandָ��
	 * @return �����ɹ�����ʧ��
	 */
	public boolean list(String command);
	/**
	 * ��ָ���еĲ���ɾ����¼  row / row begin-end begin
	 * @param commandָ��
	 * @return �����ɹ�����ʧ��
	 */
	public boolean delete(String command);
	/**
	 *  ��ָ���еĲ������Ҷ�Ӧ�ļ�¼
	 * @param command
	 * @return �����ɹ�����ʧ��
	 */
	public boolean find(String command);
	/**
	 *  ��ָ���еĲ���ɾ�� row / row begin-end begin
	 * @param command
	 * @return �����ɹ�����ʧ��
	 */
	public boolean sort(String command);
	/**
	 * ����������ַ�����List����׷��
	 * @param �ַ���
	 * @return �����ɹ�����ʧ��
	 */
	public boolean add(String p);
	
}
