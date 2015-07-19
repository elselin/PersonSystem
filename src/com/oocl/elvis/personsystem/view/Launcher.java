package com.oocl.elvis.personsystem.view;

import java.util.Scanner;

import com.oocl.elvis.personsystem.control.PersonSystemControlImpl;
import com.oocl.elvis.personsystem.model.PersonBean;
import com.oocl.elvis.util.LinkedList;

public class Launcher {
	public static void main(String[] args) {
		/*
		 * init Data
		 */		
		LinkedList<PersonBean> pl = new LinkedList<PersonBean>();
		Init.initData(pl);
		/*
		 * controller generate
		 */
		PersonSystemControlImpl controller = new PersonSystemControlImpl(pl);
		/*
		 * first time list
		 */
		controller.list();
		System.out.println("\n"+pl.getLength() + " Person on list"+"\n");
		
		/*
		 * Launcher console input
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
					System.out.println("Template: (row)1 / (row begin-row end)3-4");
					command = scan.nextLine();
				} while (!(controller.list(command)));
				break;
			case "D":
				do {
					System.out.println("Template: (row)1 / (row begin-row end)3-4");
					command = scan.nextLine();
				} while (!(controller.delete(command)));
				break;
			case "F":
				do {
					System.out.println("Template: (id)2 (eq/lt/gt)eq");
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
