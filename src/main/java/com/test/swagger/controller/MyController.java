package com.test.swagger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.swagger.service.IStudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
public class MyController {
	
	@Autowired
	IStudentService studentService;
	@ApiOperation(
			value="/student/queryAll.action",
			httpMethod="GET",
			response=String.class,
			notes="to queryAll student")
	@RequestMapping(value="/student/queryAll.action", method=RequestMethod.GET)
	public String queryAll(Map<String,Object> map){
		
		return "listAll";
	}
	@ApiOperation(
			value="/student/deleteStudentById.action",
			httpMethod="GET",
			response=String.class,
			notes="to delete student by id")
	@RequestMapping(value="/student/deleteStudentById.action",method=RequestMethod.GET)
	public String deleteStudentById(@ApiParam(value="the primary key of student") @RequestParam("id") Integer id){
		try {
			System.out.println("id:"+id);
			studentService.deleteStudentById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return "redirect:/student/queryAll.action";
	}
	@ApiOperation(
			value="/student/toUpdate.action",
			httpMethod="GET",
			response=String.class,
			notes="turn to update jsp file")
	@RequestMapping(value="/student/toUpdate.action",method=RequestMethod.GET)
	public String toUpdate(@ApiParam(value="the primary key of student")Integer id,Model model){
		System.out.println(id);
		
	
		return "toUpdate";
	}

	@ApiOperation(
			value="/student/toAdd.action",
			httpMethod="GET",
			response=String.class,
			notes="turn to toAdd jsp file")
	@RequestMapping(value="/student/toAdd.action",method=RequestMethod.GET)
	public String toaddStudent(){
		return "toAdd";
	}
	
}
