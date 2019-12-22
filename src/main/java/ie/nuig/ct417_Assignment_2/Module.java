package SamDuignan.app;

import java.util.ArrayList;

public class Module
{
	private String name;
	private int id;
	private ArrayList<Student> students = new ArrayList<Student>();

	public Module(String module_name, int id, ArrayList<Student> students) {
		this.name = module_name;
		this.id = id;
		this.students = students;
	}

	public String getName() {
		return this.name;
	}

	public String setName(String name) {
		this.name = name;
	}

	public int getID() {
		return this.id;
	}

	public int setID(int id) {
		this.id = id;
	}

	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public void addStudents(ArrayList<Student> students) {
		this.students.addAll(students);
	}

}