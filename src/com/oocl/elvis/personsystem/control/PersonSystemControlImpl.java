package com.oocl.elvis.personsystem.control;

import com.oocl.elvis.personsystem.command.Command;
import com.oocl.elvis.personsystem.model.PersonBean;
import com.oocl.elvis.personsystem.model.LinkedList;

public class PersonSystemControlImpl implements PersonSystemControl {

	LinkedList<PersonBean> list;

	public PersonSystemControlImpl(LinkedList<PersonBean> Personlist) {
		// constructor
		this.list = Personlist;
	}

	@Override
	public void list() {
		// show all nodes
		System.out.println("id\tname\tsex\tbirth\taddre\t tele");
		System.out.println("---------------------------------------");
		list.list();
	}

	@Override
	public boolean list(String commandStr) {
		// list showing in position...
		Command commandDelete = new Command();
		commandDelete.checkCommandCount(commandStr);
		System.out.println("id\tname\tsex\tbirth\taddre\t tele");
		System.out.println("---------------------------------------");
		int begin = commandDelete.getBeginRow();
		int end = commandDelete.getEndRow();
		if (begin == end) {
			System.out.println(list.get(begin));
			return true;
		} else if (begin < end) {
			while (begin <= end) {				
				System.out.println(list.get(begin));
				begin++;
			}
			return true;
		} else if (begin > end) {
			while (begin >= end) {		
				System.out.println(list.get(end));
				end++;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String commandStr) {
		// delete node
		Command commandDelete = new Command();
		commandDelete.checkCommandCount(commandStr);
		int begin = commandDelete.getBeginRow();
		int end = commandDelete.getEndRow();
		if (begin > list.getLength() - 1 || end > list.getLength() - 1) {
			System.out.println("out of list, please input again");
			return false;
		}
		if (begin == end) {
			list.delete(begin);
			return true;
		} else if (begin < end) {
			while (begin <= end) {
				list.delete(begin);
				end--;
			}
			return true;
		} else if (begin > end) {
			while (begin >= end) {
				list.delete(end);
				begin--;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean find(String commandStr) {
		/*
		 * find by id
		 */
		Command commandFind = new Command();
		commandFind.checkCommandFind(commandStr);
		int type = commandFind.getFindType();
		int id = commandFind.getId();
		// when id didn't exist(not ready)
		int pos = 0;
		if (type == Command.EQ) {
			// contain id
			while (list.get(pos) != null) {
				if (list.get(pos).getId() == id) {
					System.out.println(list.get(pos));
					return true;
				}
				pos++;
			}

		} else if (type == Command.LT) {
			// less than id
			while (list.get(pos) != null) {
				if (list.get(pos).getId() < id) {
					System.out.println(list.get(pos));
				}
				pos++;
			}
			return true;
		} else if (type == Command.GT) {
			// more than id
			while (list.get(pos) != null) {
				if (list.get(pos).getId() > id) {
					System.out.println(list.get(pos));
				}
				pos++;
			}
			return true;

		} else {
			System.out.println("unknow command");
		}
		return false;

	}

	@Override
	public boolean sort(String commandStr) {
		// still not in qualified
		String colName = commandStr.replaceAll("[\\w]+$", "").replaceAll("\\s","");
		Command comm = new Command();
		comm.checkCommandSort(commandStr);
		int flag = comm.getSortType();
		PersonBean lp;
		PersonBean rp;
		if (colName.equals("id")) {
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);
					if (list.get(j + 1).getId() * flag < list.get(j).getId()) {
						list.replace(rp, j);
						list.replace(lp, j + 1);
					}
				}
			}
			list.list();
			return true;
		} else if (colName.equals("name")) {
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);
					if (list.get(j + 1).getName().compareTo(list.get(j).getName())* flag < 1) {
						list.replace(rp, j);
						list.replace(lp, j + 1);
					}
				}
			}
			list.list();
			return true;
		} else if (colName.equals("address")) {
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);
					if (list.get(j + 1).getAddress().compareTo(list.get(j).getAddress())* flag < 1) {
						list.replace(rp, j);
						list.replace(lp, j + 1);
					}
				}
			}
			list.list();
			return true;
		} else if (colName.equals("birth")) {
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);
					if (list.get(j + 1).getBirth().compareTo(list.get(j).getBirth())* flag < 1) {
						list.replace(rp, j);
						list.replace(lp, j + 1);
					}
				}
			}
			list.list();
			return true;
		} else if (colName.equals("tele")) {
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);
					if (list.get(j + 1).getTele().compareTo(list.get(j).getTele())* flag < 1) {
						list.replace(rp, j);
						list.replace(lp, j + 1);
					}
				}
			}
			list.list();
			return true;
		} else if (colName.equals("sex")) {
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);
					int ls, rs;
					if(lp.isSex()){
						ls =1;
					}else{
						ls =0;
					}
					if(rp.isSex()){
						rs =1;
					}else{
						rs =0;
					}
					rp.isSex();
					if (ls>rs) {
						list.replace(rp, j);
						list.replace(lp, j + 1);
					}
				}
			}
			list.list();
			return true;
		} 
		else {
			System.out.println("uncorrect command");
			return false;
		}

	}

	@Override
	public boolean add(String commandStr) {
		/*
		 * still lack of qualified
		 */
		String[] str;
		str = commandStr.split(",");
		PersonBean p = new PersonBean();
		p.setId(list.getLength());
		p.setName(str[0]);
		if (str[1].equals("female")) {
			p.setSex(true);
		} else {
			p.setSex(false);
		}
		p.setBirth(str[2]);
		p.setAddress(str[3]);
		p.setTele(str[4]);
		list.append(p);
		return true;
	}

}
