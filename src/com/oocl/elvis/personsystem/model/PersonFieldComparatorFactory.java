package com.oocl.elvis.personsystem.model;

import com.oocl.elvis.personsystem.model.comparator.*;

/**
 * Person Bean 的字段比较器工厂
 * 
 */
public class PersonFieldComparatorFactory implements FieldComparatorFactory<PersonBean> {
	
	  private FieldComparator<PersonBean> id = new IDFieldComparator();
	  private FieldComparator<PersonBean> name = new NameFieldComparator();
	  private FieldComparator<PersonBean> sex = new SexFieldCompartor();
	  private FieldComparator<PersonBean> birth = new BirthFieldComparator();
	  private FieldComparator<PersonBean> addr = new AddrFieldComparator();
	  private FieldComparator<PersonBean> tele = new TelFieldComparator();

	  public FieldComparator<PersonBean> getFieldComparator(String fieldName) {
	    if (fieldName.equals("id")) {
	      return id;
	    } else if (fieldName.equals("name")) {
	      return name;
	    } else if (fieldName.equals("sex")) {
	      return sex;
	    } else if (fieldName.equals("birth")) {
	      return birth;
	    } else if (fieldName.equals("address")) {
	      return addr;
	    } else if (fieldName.equals("tele")) {
	      return tele;
	    } else {
	      return null;
	    }
	  }
}
