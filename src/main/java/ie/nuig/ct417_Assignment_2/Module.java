package SamDuignan.app;

import java.util.ArrayList;

public class Module
{
	private String name;
	private String id;
	private ArrayList<Student> students = new ArrayList<Student>();

	public Module(String module_name, String id, ArrayList<Student> students) {
		this.name = module_name;
		this.id = id;
		this.students = students;
	}

	public String getName() {
		return this.name;
	}

	public String getID() {
		return this.id;
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public void addStudents(ArrayList<Student> students) {
		this.students.addAll(students);
	}

}