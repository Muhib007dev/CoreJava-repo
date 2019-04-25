package com.conceptserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	int empid;
	String empname;
	public Employee(int empid, String empname) {
		this.empid= empid;
		this.empname= empname;
	}
	void displayObjectDetails(){
		System.out.println("Deserialized object display");
		System.out.println("ID:"+this.empid+"\nNAME"+this.empname);
	}
	

}
