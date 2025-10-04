package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.form.TeacherForm;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {
	@PostMapping("teacher/new")
	String teacherData(@RequestBody TeacherForm tf1) {
		TeacherService ts = new TeacherService();
		
		String msg =ts.teacherData(tf1);
		return msg;
	}

}
