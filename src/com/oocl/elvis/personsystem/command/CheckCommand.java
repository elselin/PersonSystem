package com.oocl.elvis.personsystem.command;

public interface CheckCommand {
	/**
	 * 按输入的指令，检查出行数
	 * @param commandStr
	 */
	void checkCommandCount(String commandStr);
	/**
	 * 按输入的指令，检查出的需要查找的id范围
	 * @param commandStr
	 */
	void checkCommandFind(String commandStr);
	/**
	 * 按输入的指令，检查出排序的类型
	 * @param commandStr
	 */
	void checkCommandSort(String commandStr);
}
