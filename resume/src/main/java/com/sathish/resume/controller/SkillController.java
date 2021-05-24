package com.sathish.resume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.resume.model.Skills;
import com.sathish.resume.repository.SkillRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class SkillController {

	@Autowired
	private SkillRepository skillRepo;
	
	@GetMapping("skills")
	public List<Skills> getSkills(){
		
		return this.skillRepo.findAll();
		
	}
}
