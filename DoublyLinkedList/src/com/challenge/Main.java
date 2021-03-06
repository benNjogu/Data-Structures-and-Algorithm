package com.challenge;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		list.addToFront(steveJobs);
		list.addToFront(lenoxNjogu);
		list.addToFront(aliceKamande);
		list.addToFront(jamesKamande);
		
		Employee bliGates = new Employee(1221, "Bli", "Gates");
		list.addToEnd(bliGates);
		
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());
		Employee tomasEdison = new Employee(1221, "Tomas", "Edison");
		list.addBefore(tomasEdison, steveJobs);
		list.printList();
	}

}
