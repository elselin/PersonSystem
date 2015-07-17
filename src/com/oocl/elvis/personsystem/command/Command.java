package com.oocl.elvis.personsystem.command;

public class Command implements CheckCommand {

	int beginRow;
	int endRow;
	int sortType;
	int findType;
	int id;

	public static final int ASC = 1;
	public static final int DESC = -1;

	public static final int LT = 0;
	public static final int GT = 1;
	public static final int EQ = 2;

	public Command() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkCommandCount(String commandStr) {
		if (commandStr.matches("^[\\d]$")) {
			this.beginRow = Integer.parseInt(commandStr);
			this.endRow = Integer.parseInt(commandStr);

		} else if (commandStr.matches("^[\\d]-[\\d]$")) {

			this.beginRow = Integer.parseInt(commandStr.replaceAll("[-][\\d]$",
					""));
			this.endRow = Integer.parseInt(commandStr.replaceAll("^[\\d][-]",
					""));
		} else {
			System.out.println("command not correct...");
		}
	}

	public void checkCommandFind(String commandStr) {	
			//no qualified
			id = Integer.parseInt(commandStr.replaceAll("[\\D]",""));
			String com =commandStr.replaceAll("[^a-zA-Z]","");		
			if (com.matches("lt")) {
				//less than id
				findType = LT;
			} else if (com.matches("gt")) {
				//more than id
				findType = GT;
			} else if (com.matches("eq")) {
				//more than id
				findType = EQ;			
			} else {
				System.out.println("command not correct...");
			}
		}
	
	public void checkCommandSort(String commandStr) {	
		//no qualified
		String sc = commandStr.replaceAll("^[\\w]+", "").replaceAll("\\s", "");
		if(sc.equals("ASC")){
			sortType = ASC;
		}else if(sc.equals("DESC")){
			sortType = DESC;
		}
	}
	
	public int getBeginRow() {
		return beginRow;
	}

	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getSortType() {
		return sortType;
	}

	public void setSortType(int sortType) {
		this.sortType = sortType;
	}

	public int getFindType() {
		return findType;
	}

	public void setFindType(int findType) {
		this.findType = findType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
