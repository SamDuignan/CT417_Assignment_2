package SamDuignan.app;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {

	private String name;
	private int age;
	private DateTime dob;
	private int id;
	private String username;


	public Student(String name, int age, DateTime dob, int id)
	{
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public DateTime getDob() {
		return this.dob;
	}

	public int getID() {
		return this.id;
	}

	public String getUsername() {
		return this.name + this.age;
	}

}


