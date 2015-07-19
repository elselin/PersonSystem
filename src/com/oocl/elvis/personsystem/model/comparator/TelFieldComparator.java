package com.oocl.elvis.personsystem.model.comparator;

import com.oocl.elvis.personsystem.model.PersonBean;


public class TelFieldComparator implements FieldComparator<PersonBean> {

  public int compare(PersonBean o1, PersonBean o2) {
    return o1.getTele().compareTo(o2.getTele());
  }

}
