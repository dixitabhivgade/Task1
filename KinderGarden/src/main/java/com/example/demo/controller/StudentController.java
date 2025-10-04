package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.AdmissionForm;
import com.example.demo.service.StudentService;
@RestController
public class StudentController {
	@PostMapping("admission/new")
String admission(@RequestBody AdmissionForm af1) {
		
		StudentService ss = new StudentService();
		String msg = ss.admission(af1);
	return msg;
}
}
