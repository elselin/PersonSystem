package com.oocl.elvis.personsystem.control;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.oocl.elvis.personsystem.command.Command;
import com.oocl.elvis.personsystem.model.PersonBean;
import com.oocl.elvis.personsystem.model.PersonFieldComparatorFactory;
import com.oocl.elvis.personsystem.model.comparator.*;
import com.oocl.elvis.personsystem.util.LinkedList;

public class PersonSystemControlImpl implements PersonSystemControl {

	LinkedList<PersonBean> list;
	
	private FieldComparatorFactory<PersonBean> fieldComparatorFactory = new PersonFieldComparatorFactory();

	public PersonSystemControlImpl(LinkedList<PersonBean> Personlist) {
		/*
		 * linked list constructor
		 */
		this.list = Personlist;
	}

	@Override
	public void list() {
		System.out.println("id\tname\tsex\tbirth\taddre\t tele");
		System.out.println("---------------------------------------");
		list.list();
	}

	@Override
	public boolean list(String commandStr) {
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
		/*
		 *  delete node
		 */
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
	
	public boolean sort(String commandStr) {
		Command comm =new Command();
		comm.checkCommandSort(commandStr);
		String colName = commandStr.replaceAll("[\\w]+$", "").replaceAll("\\s","");
		//upper case in first word
		//colName = colName.substring(0, 1).toUpperCase()+colName.replaceFirst("\\w","");
		
		FieldComparator<PersonBean> comparator = fieldComparatorFactory.getFieldComparator(colName);
	    if (comparator == null) {
	      return false;
	    } else {
	      for (int i = 0; i < this.list.getLength() - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < this.list.getLength(); j++) {
	          if (comparator.compare(this.list.get(j), this.list.get(minIndex))* comm.getSortType() < 0) {
	            minIndex = j;
	          }
	        }
	        if (minIndex != i) {
	          PersonBean temp = this.list.get(i);
	          this.list.replace(this.list.get(minIndex), i);
	          this.list.replace(temp, minIndex);	          
	        }
	      }
	      this.list.list();
	      return true;
	    }
		
	}
	
	/*
	 * sort in reflect call 
	 *
	 */
	@Deprecated
	public boolean sortInRelect(String commandStr) {		
		// still need to qualified		 
		String colName = commandStr.replaceAll("[\\w]+$", "").replaceAll("\\s","");
		colName = colName.substring(0, 1).toUpperCase()+colName.replaceFirst("\\w","");
		
		try {
			/*
			 * begin reflect call
			 */
			Method method = PersonBean.class.getDeclaredMethod("get"+colName);
			method.setAccessible(true);
			/*
			 * begin sort
			 */
			Command comm = new Command();
			comm.checkCommandSort(commandStr);
			int flag = comm.getSortType();
			PersonBean lp;
			PersonBean rp;
			
			for (int i = 0; i < list.getLength() - 1; i++) {
				for (int j = 0; j < list.getLength() - 1 - i; j++) {
					lp = list.get(j);
					rp = list.get(j + 1);								
					if(method.invoke(list.get(0)).getClass().toString().equals("class java.lang.Integer")){
						if ((Integer)method.invoke(list.get(j+1))*flag<(Integer)method.invoke(list.get(j))) {
							list.replace(rp, j);
							list.replace(lp, j + 1);						
						}
					}
					
					if(method.invoke(list.get(0)).getClass().toString().equals("class java.lang.String")){
						if (method.invoke(list.get(j+1)).toString().compareTo(method.invoke(list.get(j)).toString()) * flag <1) {
							list.replace(rp, j);
							list.replace(lp, j + 1);						
						}
						
					}				
					
				}
			}
			list.list();			
			return true;

		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

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
		p.setSex(str[1]);
		p.setBirth(str[2]);
		p.setAddress(str[3]);
		p.setTele(str[4]);
		list.append(p);
		return true;
	}

}
