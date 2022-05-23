package com.callor.student.controller;

import java.io.IOException;

import com.callor.student.serviceImpl.StudentServiceImpl;

public class Controller {
	
	public static void main(String[] args) throws IOException {
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		studentServiceImpl.inputStudent();
		studentServiceImpl.Studentadd();
		studentServiceImpl.printStudent();
	}

}
