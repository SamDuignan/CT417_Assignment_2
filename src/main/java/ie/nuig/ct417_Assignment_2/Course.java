package SamDuignan.app;

import java.util.ArrayList;

import org.joda.time.*;

public class Course {

	private ArrayList<Module> modules = new ArrayList<Module>();
	private DateTime start;
	private DateTime end;
    private String name;

	public Course(String course, ArrayList<Module> module, DateTime start, DateTime end) {
		this.name = course;
		this.modules = module;
		this.start = start;
		this.end = end;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String course) {
		this.name = course;
	}

	public ArrayList<Module> getModules() {
		return this.modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public DateTime getStart() {
		return this.start;
	}

	public DateTime getEnd() {
		return this.end;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}
	
}