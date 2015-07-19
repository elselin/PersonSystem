package com.oocl.elvis.personsystem.view;

import java.util.Scanner;

import com.oocl.elvis.personsystem.control.PersonSystemControlImpl;
import com.oocl.elvis.personsystem.model.PersonBean;
import com.oocl.elvis.personsystem.model.LinkedList;

public class Launcher {
	public static void main(String[] args) {
		/*
		 * init Data
		 */
		LinkedList<PersonBean> pl = new LinkedList<PersonBean>();
		PersonBean p1 = new PersonBean(1, "one", true, "2001", "ZHA",
				"0671-277993");
		PersonBean p2 = new PersonBean(2, "two", false, "2002", "ZHA",
				"0671-277993");
		PersonBean p3 = new PersonBean(3, "three", false, "2003", "ZHA",
				"0671-277993");
		PersonBean p4 = new PersonBean(4, "four", true, "2004", "ZHA",
				"0671-277993");
		PersonBean p5 = new PersonBean(5, "five", true, "2005", "ZHA",
				"0671-277993");

		PersonSystemControlImpl controller = new PersonSystemControlImpl(pl);

		pl.append(p1);
		pl.append(p2);
		pl.append(p3);
		pl.append(p4);
		pl.append(p5);		
		
		
		controller.list();
		System.out.println("\n"+pl.getLength() + " Person on list"+"\n");
		
		/*
		 * Launcher
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please input Command L D F S A Q");
		String command = scan.nextLine();
		while (!("Q".equals(command))) {
			switch (command) {
			case "LA":
				controller.list();				
				break;
			case "L":
				do {					
					command = scan.nextLine();
				} while (!(controller.list(command)));
				break;
			case "D":
				do {					
					command = scan.nextLine();
				} while (!(controller.delete(command)));
				break;
			case "F":
				do {					
					command = scan.nextLine();
				} while (!(controller.find(command)));
				break;
			case "S":		
				do {
					System.out.println("Template: (column name)id (ASC)DESC");
					command = scan.nextLine();					
				} while (!(controller.sort(command)));
				break;
			case "A":
				do {					
					System.out.println("name,sex,birth,addre,tele");
					command = scan.nextLine();					
				} while (!(controller.add(command)));				
				break;

			default:
				System.out.println("Input Again");
			}
			System.out.println("please input Command L D F S A Q");
			command = scan.nextLine();
		}
	}
}
