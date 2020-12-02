package p2;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<String> eList = new ArrayList<String>();
	Student(){
	}
	Student(String name, ArrayList<String> eList){
		this.name = name;
		this.eList = eList;
	}
	
	void setName(String newName) {
		this.name = newName;
	}
	String getName() {
		return this.name;
	}
	void seteList(ArrayList<String> neweList) {
		this.eList = neweList;
	}
	ArrayList<String> geteList() {
		return this.eList;
	}
}