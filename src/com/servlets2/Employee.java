package com.servlets2;

public class Employee {

 private int ID;
 private String Name;
 private int salary;
 
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "Employee [ID=" + ID + ", Name=" + Name + ", salary=" + salary + "]";
}



 
}
