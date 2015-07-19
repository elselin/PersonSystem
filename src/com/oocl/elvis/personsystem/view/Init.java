package com.oocl.elvis.personsystem.view;

import com.oocl.elvis.personsystem.model.PersonBean;
import com.oocl.elvis.util.LinkedList;

public class Init {
	
	public static void initData(LinkedList<PersonBean> pl) {
		
		PersonBean p1 = new PersonBean(1, "one", "Female", "2001", "ZHA",
				"0671-277993");
		PersonBean p2 = new PersonBean(2, "two", "Male", "2002", "GD",
				"0671-277993");
		PersonBean p3 = new PersonBean(3, "three", "Male", "2003", "ZHA",
				"0671-277993");
		PersonBean p4 = new PersonBean(4, "frye", "Female", "2004", "HK",
				"0671-277993");
		PersonBean p5 = new PersonBean(5, "five", "Female", "2005", "ZHA",
				"0671-277993");
		PersonBean p6 = new PersonBean(12, "six", "Male", "2001", "SHA",
				"0671-277993");
		PersonBean p7 = new PersonBean(26, "seven", "Male", "1982", "HK",
				"0671-277993");
		PersonBean p8 = new PersonBean(33, "John", "Female", "1993", "ZHA",
				"0671-277993");
		PersonBean p9 = new PersonBean(41, "smith", "Male", "2004", "JAP",
				"0671-277993");
		PersonBean p10 = new PersonBean(50, "five", "Male", "2005", "ZHA",
				"0671-277993");
		pl.append(p5);
		pl.append(p2);
		pl.append(p4);
		pl.append(p1);
		pl.append(p10);		
		pl.append(p6);
		pl.append(p7);
		pl.append(p3);
		pl.append(p9);
		pl.append(p8);
	}

}
