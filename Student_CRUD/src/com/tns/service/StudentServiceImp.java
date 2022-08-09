package com.tns.service;

import com.tns.doa.StudentDao;
import com.tns.doa.StudentDaoImp;
import com.tns.entity.Student;

public class StudentServiceImp implements StudentService {

	private StudentDao dao;
	public StudentServiceImp() {
		dao = new StudentDaoImp();
	}
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.begintTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		dao.begintTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.begintTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student= dao.getStudentId(id);
		return student;
	}

}
