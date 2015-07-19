package com.oocl.elvis.personsystem.model.comparator;

import com.oocl.elvis.personsystem.model.PersonBean;

/**
 * for Sex of Person
 */
public class SexFieldCompartor implements FieldComparator<PersonBean> {

  public int compare(PersonBean o1, PersonBean o2) {
    return o1.getSex().compareTo(o2.getSex());
  }

}
