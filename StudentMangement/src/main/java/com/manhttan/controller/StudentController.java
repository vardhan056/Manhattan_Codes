package com.manhttan.controller;

import com.manhttan.Inter.StudentService;

public class StudentController {
	int sid;
	String name;
	double fee;
private StudentService std;
public StudentController(StudentService std) {
	this.std = std;
}
public int saveStudent(int sid,String name,double fee) {
	return std.save(sid,name,fee);
}
}
