package com.example.demo.service;



import com.example.demo.form.AdmissionForm;

public class StudentService {
	public String admission( AdmissionForm af1) {
		if(af1.getStname()== null) {
			return"Enter Name:";
									
		}
		else if(af1.getAge()<2) {
			return"Invalid Age";
		}
		
		else if(String.valueOf(af1.getStmobno()).length() != 10) {
			return "Invalid mobile no :";
			
				}
		else if(String.valueOf(af1.getStaadhar()).length() != 12) {
			return "Invalid aadhar no :";
			
		}
		
		
		
		
		return  "Admission done";
	}
}
