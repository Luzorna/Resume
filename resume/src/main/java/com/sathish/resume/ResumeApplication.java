package com.sathish.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sathish.resume.model.Skills;
import com.sathish.resume.repository.SkillRepository;

@SpringBootApplication
public class ResumeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}

	@Autowired
	private SkillRepository skillRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		skillRepo.save(new Skills("Core Java","7"));
		skillRepo.save(new Skills("Spring boot","6"));
		skillRepo.save(new Skills("Angular Js","7"));
		skillRepo.save(new Skills("Angular","5"));
	}

}
