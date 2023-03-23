package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("The Student's name is R.SAISURYA");
	}
	
	public void studentDept() {
		System.out.println("Student's department is I.T");
	}
	
	public void studentId() {
		System.out.println("Student's Id is : RSS8448");
	}
	
	public static void main(String[] args) {
		Student studInfo = new Student();
		studInfo.collegeName();
		studInfo.collegeCode();
		studInfo.collegeRank();
		studInfo.deptName();
		studInfo.studentName();
		studInfo.studentDept();
		studInfo.studentId();

	}

}
