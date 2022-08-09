package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImp;

public class Client {
 public static void main(String ar[]) {
	 StudentService service= new StudentServiceImp();
	 Student student = new Student();
	 
	 //CRUD
	 
	 //Create Operation
//	 student.setStudentId(1);
//	 student.setName("sanket");
//	 service.addStudent(student);
	 
//	 student.setStudentId(2);
//	 student.setName("Deepak");
//	 service.addStudent(student);
	 
	 //Retrieve Operation
//	 student = service.findStudentById(1);
//	 System.out.print("ID:" +student.getStudentId());
//	 System.out.print("Name:" +student.getName());
//	 
	 //update Operation
	 student =service.findStudentById(2);
	 student.setName("Deepak jaiswal");
	 service.updateStudent(student);
	 
	 //Delete Operation
//	 student = service.findStudentById(1);
//	 service.removeStudent(student);
//	 System.out.println("End of Program/life Cycle complete.......");
 }
}
