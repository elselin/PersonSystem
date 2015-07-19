package com.oocl.elvis.personsystem.model.comparator;

import com.oocl.elvis.personsystem.model.PersonBean;

/**
 * for Name of Person
 */
public class NameFieldComparator implements FieldComparator<PersonBean> {

  public int compare(PersonBean o1, PersonBean o2) {
    return o1.getName().compareTo(o2.getName());
  }

}
