package com.oocl.elvis.personsystem.command;

public interface CheckCommand {
	/**
	 * �������ָ���������
	 * @param commandStr
	 */
	void checkCommandCount(String commandStr);
	/**
	 * �������ָ���������Ҫ���ҵ�id��Χ
	 * @param commandStr
	 */
	void checkCommandFind(String commandStr);
	/**
	 * �������ָ��������������
	 * @param commandStr
	 */
	void checkCommandSort(String commandStr);
}
