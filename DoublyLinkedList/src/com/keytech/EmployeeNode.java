package com.keytech;

public class EmployeeNode {

	private EmployeeNode previous;
	private Employee employee;
	private EmployeeNode next;

	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}
	
}