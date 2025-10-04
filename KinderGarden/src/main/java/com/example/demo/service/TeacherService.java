package com.example.demo.service;

import com.example.demo.form.TeacherForm;

public class TeacherService {
	public String teacherData( TeacherForm tf1) {
		if(tf1.getTname()== null) {
			return"Enter Name:";
									
		}
		else if(tf1.getTaddress()==null) {
			return"Invalid address";
		}
		
		else if(String.valueOf(tf1.getTmobno()).length() != 9) {
			return "Invalid mobile no :";
			
				}
		else if(String.valueOf(tf1.getTaadhar()).length() != 11) {
			return "Invalid aadhar no :";
			
		}
		
		
return "teacher added";
	}
}