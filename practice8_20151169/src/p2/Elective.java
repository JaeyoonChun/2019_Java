package p2;

import java.util.ArrayList;

public class Elective {
	private String name;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<String> stName = new ArrayList<String>();
	
	Elective(){}
	Elective(String name, ArrayList<Student> studentList){
		this.name = name;
		this.studentList = studentList;		
	}
	String getName() {
		return this.name;
	}
	
	ArrayList<String> getStName(){
		for(int i = 0; i < studentList.size(); i++) {
			for (int j = 0; j < studentList.get(i).geteList().size() ; j++){
				if (name.equals(studentList.get(i).geteList().get(j))){
					this.stName.add(studentList.get(i).getName());
				}
			}
		}
		return this.stName;
	}
}
