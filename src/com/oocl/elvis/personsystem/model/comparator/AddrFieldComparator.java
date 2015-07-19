package com.oocl.elvis.personsystem.model.comparator;

import com.oocl.elvis.personsystem.model.PersonBean;
/**
 * for address of user
 *
 */
public class AddrFieldComparator implements FieldComparator<PersonBean> {

  public int compare(PersonBean o1, PersonBean o2) {
    return o1.getAddress().compareTo(o2.getAddress());
  }

}
