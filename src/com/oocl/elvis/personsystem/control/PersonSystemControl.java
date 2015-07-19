package com.oocl.elvis.personsystem.control;

public interface PersonSystemControl {
	
	/**
	 * 列出Person Bean List 中所有的内容
	 */
	public void list();
	/**
	 * 按指令中的参数输出记录 row / row begin-end begin
	 * @param command指令
	 * @return 操作成功或者失败
	 */
	public boolean list(String command);
	/**
	 * 按指令中的参数删除记录  row / row begin-end begin
	 * @param command指令
	 * @return 操作成功或者失败
	 */
	public boolean delete(String command);
	/**
	 *  按指令中的参数查找对应的记录
	 * @param command
	 * @return 操作成功或者失败
	 */
	public boolean find(String command);
	/**
	 *  按指令中的参数删除 row / row begin-end begin
	 * @param command
	 * @return 操作成功或者失败
	 */
	public boolean sort(String command);
	/**
	 * 根据输入的字符串对List进行追加
	 * @param 字符串
	 * @return 操作成功或者失败
	 */
	public boolean add(String p);
	
}
